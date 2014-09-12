package box.ast.parser;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.antlr.runtime.*;
import org.eclipse.dltk.ast.declarations.MethodDeclaration;
import org.eclipse.dltk.ast.declarations.TypeDeclaration;
import org.eclipse.dltk.ast.statements.Block;
import org.eclipse.dltk.ast.statements.Statement;
import org.eclipse.dltk.compiler.problem.DefaultProblem;
import org.eclipse.dltk.compiler.problem.IProblem;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.dltk.compiler.problem.ProblemSeverities;

import box.ast.nodes.ASTError;
import box.ast.nodes.ASTNodeKinds;
import box.ast.nodes.NamespaceDeclaration;
import box.ast.nodes.php.PHPModuleDeclaration;
import box.ast.nodes.php.VarComment;

abstract public class AbstractASTParser extends Parser{
    private PHPModuleDeclaration program = new PHPModuleDeclaration(0, 0, new LinkedList<Statement>(), new LinkedList<ASTError>(), new LinkedList<VarComment>());
    public Stack<Statement> declarations = new Stack<Statement>();
    private IProblemReporter problemReporter;
    private String fileName;
    
    /** This is a place holder for statements that were found after unclosed classes */
    public Statement pendingStatement = null;
    
    /** This is a latest non-bracketed namespace declaration */
    public NamespaceDeclaration currentNamespace = null;
    
    /** Whether we've met the unbracketed namespace declaration in this file */
    public boolean metUnbracketedNSDecl;
    
    /** Whether we've met the bracketed namespace declaration in this file */
    public boolean metBracketedNSDecl;
    
    public AbstractASTParser(TokenStream input) {
        super(input);
    }
    
    public AbstractASTParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }
    
    public PHPModuleDeclaration getModuleDeclaration() {
        return this.program;
    }
    
    /**
     * Report on errors that will be added to the AST as statements
     */
    public void reportError() {
        program.setHasErrors(true);
    }
    
    /**
     * Reporting an error that cannot be added as a statement and has to be in a separated list.
     * @param error
     */
    public void reportError(ASTError error, String message) {
        getErrors().add(error);
        reportError();
        
        if (message != null && problemReporter != null && fileName != null) {
//          int lineNumber = ((AstLexer) getScanner()).getCurrentLine();
            int lineNumber = 10;
            reportError(problemReporter, fileName, error.sourceStart(), error.sourceEnd(), lineNumber, message);
        }
    }
    
    public void addStatement(Statement s) {
        int kind = s.getKind();
        if (kind != ASTNodeKinds.EMPTY_STATEMENT.ordinal() && kind != ASTNodeKinds.DECLARE_STATEMENT.ordinal() && kind != ASTNodeKinds.NAMESPACE_DECLARATION.ordinal() && metBracketedNSDecl) {
            reportError(new ASTError(s.sourceStart(), s.sourceEnd()), "No code may exist outside of namespace {}");
        }
        
        if (currentNamespace != null && currentNamespace != s) {
            currentNamespace.addStatement(s);
        } else {
            program.addStatement(s);
        }
    }
    
    public void addDeclarationStatement(Statement statement) {
        if (declarations.isEmpty()) {
            if (statement.getKind() == ASTNodeKinds.NAMESPACE_DECLARATION.ordinal()) {
                if (program.getStatements().size() > 0 && !metBracketedNSDecl && !metUnbracketedNSDecl) {
                    boolean justDeclarationNodes = true;
                    for (Object s : program.getStatements()) {
                        if (((Statement)s).getKind() != ASTNodeKinds.DECLARE_STATEMENT.ordinal()) {
                            justDeclarationNodes = false;
                            break;
                        }
                    }
                    if (!justDeclarationNodes) {
                        reportError(new ASTError(statement.sourceStart(), statement.sourceEnd()), "Namespace declaration statement has to be the very first statement in the script");
                    }
                }
            }
            
            // we don't add top level statements to the program node this way
            return;
        }
        Statement node = declarations.peek();
        Block block = null;
        if (node instanceof TypeDeclaration) {
            block = ((TypeDeclaration) node).getBody();
        } else if (node instanceof MethodDeclaration) {
            block = ((MethodDeclaration) node).getBody();
        } else if (node instanceof Block) {
            block = (Block) node;
        }
        block.addStatement(statement);
        block.setEnd(statement.sourceEnd());
    }
    
    protected List<ASTError> getErrors() {
        return program.getErrors();
    }
    
    protected void reportError(IProblemReporter problemReporter, String fileName, int start, int end, int lineNumber, String message) {
        DefaultProblem problem = new DefaultProblem(fileName, message, IProblem.Syntax, new String[0], ProblemSeverities.Error, start, end, lineNumber);
        problemReporter.reportProblem(problem);
    }
}


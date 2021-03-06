package box.ast.nodes.php;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.declarations.MethodDeclaration;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.declarations.TypeDeclaration;
import org.eclipse.dltk.ast.statements.Statement;
import org.eclipse.dltk.core.DLTKCore;

import box.ast.nodes.ASTError;
import box.ast.nodes.ASTNodeKinds;
import box.ast.nodes.NamespaceDeclaration;
import box.ast.visitor.ASTPrintVisitor;

public class PHPModuleDeclaration extends ModuleDeclaration {
    private List<ASTError> errors;
    private boolean hasErrors;
    private List<VarComment> varComments;
    
    public PHPModuleDeclaration(int start, int end, List<Statement> statements, List<ASTError> errors, List<VarComment> varComments) {
        super(end - start, true);
        setStatements(statements);
        setStart(start);
        setEnd(end);
        this.errors = errors;
        this.varComments = varComments;
    }

    public List<ASTError> getAllErrors() {
        ErrorSearcher searcher = new ErrorSearcher();
        try {
            traverse(searcher);
        } catch (Exception e) {
        }
        List<ASTError> errorsList = searcher.getErrors();
        errorsList.addAll(getErrors());
        return errorsList;
    }

    public void doRebuild() {
        List statements = getStatements();
        if (statements != null) {
            Iterator i = statements.iterator();
            while (i.hasNext()) {
                final ASTNode node = (ASTNode) i.next();
                try {
                    node.traverse(new ASTVisitor() {
                        private Stack<ASTNode> parentStack = new Stack<ASTNode>();
                        
                        public boolean visit(MethodDeclaration s) throws Exception {
                            if (s != node && (parentStack.isEmpty() || !(parentStack.peek() instanceof TypeDeclaration))) {
                                getFunctionList().add(s);
                            }
                            return super.visit(s);
                        }

                        public boolean visit(TypeDeclaration s) throws Exception {
                            if (s instanceof NamespaceDeclaration && ((NamespaceDeclaration)s).isGlobal()) {
                                return super.visit(s);
                            }
                            parentStack.add(s);
                            getTypeList().add(s);
                            return super.visit(s);
                        }
                        
                        public boolean endvisit(TypeDeclaration s) throws Exception {
                            if (s instanceof NamespaceDeclaration && ((NamespaceDeclaration)s).isGlobal()) {
                                return super.endvisit(s);
                            }
                            parentStack.pop();
                            return super.endvisit(s);
                        }
                    });
                } catch (Exception e) {
                    if (DLTKCore.DEBUG) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    
    public void addStatement(Statement statement) {
        super.addStatement(statement);
    }
    
    public List<ASTError> getErrors() {
        return errors;
    }

    public boolean hasErrors() {
        return hasErrors || !errors.isEmpty();
    }

    public void setHasErrors(boolean hasErrors) {
        this.hasErrors = hasErrors;
    }
    
    public List<VarComment> getVarComments() {
        return varComments;
    }

    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
    
    private class ErrorSearcher extends ASTVisitor{
        private List<ASTError> errors = new LinkedList<ASTError>();

        public boolean visit(ASTError error) throws Exception {
            errors.add(error);
            return false;
        }

        public boolean visit(Statement s) throws Exception {
            if(s.getKind() == ASTNodeKinds.AST_ERROR.ordinal()){
                return visit((ASTError)s);
            }
            return super.visit(s);
        }

        public List<ASTError> getErrors() {
            return errors;
        }
    }
}

package box.php;

import java.io.Reader;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.TreeAdaptor;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.parser.IModuleDeclaration;
import org.eclipse.dltk.ast.parser.ISourceParser;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.compiler.problem.IProblemReporter;

import box.ast.AST;
import box.ast.ASTCommonErrorNode;
import box.ast.parser.AbstractASTParser;
import box.ast.visitor.ASTPrintVisitor;

public class PHPSourceParser implements ISourceParser{
    private AST tree;
    
    public static TreeAdaptor tokenAdaptor = new CommonTreeAdaptor() {
        public Object create(Token token) {
            return new AST(token);
        }

        public Object dupNode(Object t) {
            if (t == null) {
                return null;
            }
            return create(((AST) t).token);
        }
        
        @Override 
        public Object errorNode(TokenStream input, Token start, Token stop, RecognitionException e) {
            return new ASTCommonErrorNode(input, start, stop, e);
        }
    };
    
    public PHPSourceParser() {
        super();
    }

    public void parse(Reader input, IProblemReporter reporter) throws Exception {
        ANTLRReaderStream reader = new ANTLRReaderStream(input);
        PHPASTLexer lexer = new PHPASTLexer(reader);
        CommonTokenStream tStream = new CommonTokenStream(lexer);
        PHPASTParser parser = new PHPASTParser(tStream);
        parser.setTreeAdaptor(tokenAdaptor);
        PHPASTParser.php_source_return r = parser.php_source();
        AST tree = r.getTree();
        CommonTreeNodeStream treeNodeStream = new CommonTreeNodeStream(tokenAdaptor, tree);
        treeNodeStream.setTokenStream(tStream);
        TreePHP phpTree = new TreePHP(treeNodeStream, parser);
        phpTree.setTreeAdaptor(tokenAdaptor);
        phpTree.php_source();
        this.tree = r.getTree();
    }
    
    public AST getTree() {
        return this.tree;
    }
    
    protected ModuleDeclaration parse(AbstractASTParser parser) throws Exception {
        return ((PHPASTParser)parser).getModuleDeclaration();
    }

    @Override
    public IModuleDeclaration parse(IModuleSource input, IProblemReporter reporter) {
        return null;
    }
}

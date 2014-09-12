package box.ast.nodes;

import org.eclipse.dltk.ast.declarations.TypeDeclaration;
import org.eclipse.dltk.ast.statements.Block;
import org.eclipse.dltk.ast.statements.Statement;

import box.ast.nodes.php.PHPDocBlock;
import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a namespace declaration:
 * 1.   namespace A;
 * 2.   namespace A {}
 * 3.   namespace {}
 * @author jseaidoun
 *
 */
public class NamespaceDeclaration extends TypeDeclaration {
    public static final String GLOBAL = "__global__namespace__";
    private PHPDocBlock phpDoc;
    private boolean braketed = true;
    
    public NamespaceDeclaration(int start, int end, int nameStart, int nameEnd, String namespaceName, Block body, PHPDocBlock phpDoc) {
        super(namespaceName, nameStart, nameEnd, start, end);
        this.phpDoc = phpDoc;
        if(body == null) {
            body = new Block(start, end);
        }
        setBody(body);
    }
    
    public void setBraketed(boolean braketed) {
        this.braketed = braketed;
    }
    
    public boolean isBraketed() {
        return this.braketed;
    }
    
    public boolean isGlobal() {
        return getName() == GLOBAL;
    }
    
    public PHPDocBlock getPHPDoc() {
        return this.phpDoc;
    }
    
    public void addStatement(Statement statement) {
        getBody().addStatement(statement);
        getBody().setEnd(statement.sourceEnd());
        setEnd(statement.sourceEnd());
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

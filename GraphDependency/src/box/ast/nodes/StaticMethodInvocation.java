package box.ast.nodes;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.expressions.CallArgumentsList;
import org.eclipse.dltk.ast.references.SimpleReference;

import box.ast.nodes.php.PHPCallExpression;
import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a static function invocation:
 * 1.   Holds the function invocation and the class name
 * @author jseaidoun
 *
 */
public class StaticMethodInvocation extends PHPCallExpression {
    public StaticMethodInvocation(ASTNode receiver, String name, CallArgumentsList args) {
        super(receiver, name, args);
    }
    
    public StaticMethodInvocation(int start, int end, ASTNode receiver, SimpleReference name, CallArgumentsList args) {
        super(start, end, receiver, name, args);
    }
    
    public StaticMethodInvocation(int start, int end, ASTNode receiver, String name, CallArgumentsList args) {
        super(start, end, receiver, name, args);
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.STATIC_METHOD_INVOCATION.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

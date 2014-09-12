package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a static field access:
 * 1.   MyClass::$a
 * 2.   MyClass::$$a[3]
 * @author jseaidoun
 *
 */
public class StaticFieldAccess extends StaticDispatch{
    private final Expression field;
    
    public StaticFieldAccess(int start, int end, Expression className, Expression field) {
        super(start, end, className);
        assert (field != null);
        this.field = field;
    }

    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            getDispatcher().traverse(visitor);
            this.field.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    public Expression getField() {
        return this.field;
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.STATIC_FIELD_ACCESS.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

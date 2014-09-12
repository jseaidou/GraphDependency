package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a field access
 * 1.   $a->$b
 * @author jseaidoun
 *
 */
public class FieldAccess extends Dispatch {
    private final Expression field;
    
    public FieldAccess(int start, int end, Expression dispatcher, Expression field) {
        super(start, end, dispatcher);
        assert(field != null);
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
    
    public int getKind() {
        return ASTNodeKinds.FIELD_ACCESS.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a reference to a variable to be used inside function call:
 * 1.   &$a
 * 2.   &$a[0]
 * 3.   &$$a
 * 4.   &$a['key']
 * @author jseaidoun
 *
 */
public class ReferenceExpression extends Expression {
    private final Expression variable;
    
    public ReferenceExpression(int start, int end, Expression variable) {
        super(start, end);
        assert (variable != null);
        this.variable = variable;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            this.variable.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    public Expression getVariable() {
        return this.variable;
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.REFERENCE.ordinal();
    }

}

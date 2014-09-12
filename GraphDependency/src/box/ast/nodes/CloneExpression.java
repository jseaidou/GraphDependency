package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a clone expression:
 * 1.   clone $a;
 * 2.   $a = clone $b;
 * @author jseaidoun
 *
 */
public class CloneExpression extends Expression {
    private final Expression expr;
    
    public CloneExpression(int start, int end, Expression expr) {
        super(start, end);
        assert (expr != null);
        this.expr = expr;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            this.expr.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    public Expression getExpression() {
        return this.expr;
    }

    @Override
    public int getKind() {
        return ASTNodeKinds.CLONE_EXPRESSION.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
    
}

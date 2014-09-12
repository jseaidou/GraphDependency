package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents ignore error expression:
 * 1.   '@$a->foo()'
 * @author jseaidoun
 *
 */
public class IgnoreError extends Expression {
    private final Expression expr;
    
    public IgnoreError(int start, int end) {
        this(start, end, null);
    }
    
    public IgnoreError(int start, int end, Expression expr) {
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
    
    public int getKind() {
        return ASTNodeKinds.IGNORE_ERROR.ordinal();
    }

    public Expression getExpr() {
        return expr;
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

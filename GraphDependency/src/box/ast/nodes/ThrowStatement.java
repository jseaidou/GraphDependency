package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.statements.Statement;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a throw statement:
 * 1.   throw $exceptionClass;
 * @author jseaidoun
 *
 */
public class ThrowStatement extends Statement {
    private final Expression expr;
    public ThrowStatement(int start, int end, Expression expr) {
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
    
    public Expression getExpr() {
        return this.expr;
    }

    @Override
    public int getKind() {
        return ASTNodeKinds.THROW_STATEMENT.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

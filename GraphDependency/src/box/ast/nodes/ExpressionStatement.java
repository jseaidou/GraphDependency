package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.statements.Statement;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a expression that should be evaluated:
 * $a = 5
 * $a
 * 3 + 2
 * @author jseaidoun
 *
 */
public class ExpressionStatement extends Statement {
    private final Expression expr;
    
    public ExpressionStatement(int start, int end, Expression expr) {
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
    
    public ExpressionStatement(int start, int end) {
        this(start, end, null);
    }
    
    public Expression getExpression() {
        return this.expr;
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.EXPRESSION_STATEMENT.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

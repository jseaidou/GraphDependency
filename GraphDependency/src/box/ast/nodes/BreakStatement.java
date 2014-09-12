package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Statement;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents break statements:
 * 1.   break;
 * 2.   break $a;
 * @author jseaidoun
 *
 */
public class BreakStatement extends Statement {
    private Expression expression;
    
    /**
     * Constructor for expressionless break: 
     * break;
     * @param start
     * @param end
     */
    public BreakStatement(int start, int end) {
        this(start, end, null);
    }
    
    /**
     * Constructor for break with a 'break to' command:
     * break $a;
     * @param start
     * @param end
     * @param expression
     */
    public BreakStatement(int start, int end, Expression expression) {
        super(start, end);
        this.expression = expression;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            if(this.expression != null) {
                expression.traverse(visitor);
            }
        }
        visitor.endvisit(this);
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.BREAK_STATEMENT.ordinal();
    }
    
    public Expression getExpression() {
        return this.expression;
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

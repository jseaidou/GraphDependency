package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.statements.Statement;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents while statement:
 * 1.   while(expr) statements;
 * 2.   while(expr): statements; endwhile;
 * @author jseaidoun
 *
 */
public class WhileStatement extends Statement {
    private final Expression condition;
    private final Statement action;

    public WhileStatement(int start, int end, Expression condition, Statement action) {
        super(start, end);
        assert ( (condition != null) && (action != null) );
        this.condition = condition;
        this.action = action;
    }

    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            this.condition.traverse(visitor);
            this.action.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    public Expression getCondition() {
        return condition;
    }

    public Statement getAction() {
        return action;
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.WHILE_STATEMENT.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

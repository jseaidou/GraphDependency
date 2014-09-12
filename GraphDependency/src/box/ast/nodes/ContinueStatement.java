package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Statement;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a continue statement:
 * 1.   continue;
 * 2.   continue $a;
 * @author jseaidoun
 *
 */
public class ContinueStatement extends Statement {
    private final Expression expr;
    public ContinueStatement(int start, int end) {
        this(start, end, null);
    }
    
    public ContinueStatement(int start, int end, Expression expression) {
        super(start, end);
        this.expr = expression;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            if(this.expr != null) {
                this.expr.traverse(visitor);
            }
        }
        visitor.endvisit(this);
    }
    
    public Expression getExpression() {
        return this.expr;
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.CONTINUE_STATEMENT.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

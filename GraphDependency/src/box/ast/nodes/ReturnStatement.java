package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Statement;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a return statement:
 * 1.   return;
 * 2.   return $a;
 * @author jseaidoun
 *
 */
public class ReturnStatement extends Statement {
    private final Expression expr;
    
    public ReturnStatement(int start, int end) {
        this(start, end, null);
    }
    
    public ReturnStatement(int start, int end, Expression expression) {
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
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.RETURN_STATEMENT.ordinal();
    }
}

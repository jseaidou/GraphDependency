package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Block;
import org.eclipse.dltk.ast.statements.Statement;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a switch statement:
 * 1.   switch($i) { }
 * @author jseaidoun
 *
 */
public class SwitchStatement extends Statement {
    private final Expression expr;
    private final Block body;
    public SwitchStatement(int start, int end, Expression expression, Block body) {
        super(start, end);
        assert ( (expression != null) && (body != null) );
        this.expr = expression;
        this.body = body;
    }

    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            this.expr.traverse(visitor);
            this.body.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    public Expression getExpr() {
        return this.expr;
    }

    public Block getBody() {
        return this.body;
    }

    @Override
    public int getKind() {
        return ASTNodeKinds.SWITCH_STATEMENT.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

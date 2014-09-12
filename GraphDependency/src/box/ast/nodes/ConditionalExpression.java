package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a conditional expression
 * Holds the condition, if true expression and if false expression
 * 1.   (bool) $a ? 3 : 4
 * 2.   $a > 0 ? $a : -$a
 * 3.   $a ?: $b
 * @author jseaidoun
 *
 */
public class ConditionalExpression extends Expression {
    private final Expression condition;
    private final Expression ifTrue;
    private final Expression ifFalse;
    public ConditionalExpression(int start, int end,  Expression condition, Expression ifTrue, Expression ifFalse) {
        super(start, end);
        assert( (condition != null) && (ifFalse != null) );
        this.condition = condition;
        this.ifTrue = ifTrue;
        this.ifFalse = ifFalse;
    }

    public Expression getCondition() {
        return this.condition;
    }
    
    public Expression getIfTrue() {
        return this.ifTrue;
    }
    
    public Expression getIfFalse() {
        return this.ifFalse;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            this.condition.traverse(visitor);
            if(this.ifTrue != null) {
                this.ifTrue.traverse(visitor);
            }
            this.ifFalse.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.CONDITIONAL_EXPRESSION.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

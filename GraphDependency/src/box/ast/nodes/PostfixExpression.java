package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a postfix expression:
 * 1.   $a++
 * 2.   foo()---
 * @author jseaidoun
 *
 */
public class PostfixExpression extends Expression {
    private final Expression variable;
    private final PostfixEnum operator;
    
    public PostfixExpression(int start, int end, Expression variable, PostfixEnum operator) {
        super(start, end);
        assert (variable != null);
        this.variable = variable;
        this.operator = operator;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            this.variable.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    public Expression getVariable() {
        return this.variable;
    }
    
    public PostfixEnum getOp() {
        return this.operator;
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.POSTFIX_EXPRESSION.ordinal();
    }

    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
    
    public enum PostfixEnum {
        INC,
        DEC;
    }

}

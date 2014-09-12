package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a prefix expression:
 * 1.   ++$a
 * 2.   --foo()
 * @author jseaidoun
 *
 */
public class PrefixExpression extends Expression {
    private final Expression variable;
    private final PrefixEnum operator;
    
    public PrefixExpression(int start, int end, Expression variable, PrefixEnum operator) {
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
    
    public PrefixEnum getOp() {
        return this.operator;
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.PREFIX_EXPRESSION.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
    
    public enum PrefixEnum {
        INC,
        DEC;
    }

}

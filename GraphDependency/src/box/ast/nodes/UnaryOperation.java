package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a unary operation expression:
 * 1.   +$a
 * 2.   -3
 * 3.   -foo()
 * 4.   +-+-$a
 * @author jseaidoun
 *
 */
public class UnaryOperation extends Expression {
    private final Expression expr;
    private final UnaryOperationEnum type;
    public UnaryOperation(int start, int end, Expression expr, UnaryOperationEnum operator){
        super(start, end);
        assert (expr != null);
        this.expr = expr;
        this.type = operator;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            this.expr.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    public Expression getExpr() {
        return expr;
    }

    public UnaryOperationEnum getType() {
        return type;
    }

    @Override
    public int getKind() {
        return ASTNodeKinds.UNARY_OPERATION.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
    
    public enum UnaryOperationEnum {
        UOP_PLUS,
        UOP_MINUS,
        UOP_BANG,
        UOP_TILDA;
    }

}

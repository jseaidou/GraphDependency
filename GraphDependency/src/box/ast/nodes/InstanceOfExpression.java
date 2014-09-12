package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a instanceof expression:
 * 1.   $a instanceof MyClass
 * 2.   foo() instanceof $myClass
 * 3.   $a instanceof $b->$myClass
 * @author jseaidoun
 *
 */
public class InstanceOfExpression extends Expression {
    private final Expression expr;
    private final Expression type;
    public InstanceOfExpression(int start, int end, Expression expr, Expression type) {
        super(start, end);
        assert ( (expr != null) && (type != null) );
        this.expr = expr;
        this.type = type;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            this.expr.traverse(visitor);
            this.type.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    public Expression getExpression() {
        return this.expr;
    }
    
    public Expression getType() {
        return this.type;
    }

    @Override
    public int getKind() {
        return ASTNodeKinds.INSTANCE_OF_EXPRESSION.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
    
}

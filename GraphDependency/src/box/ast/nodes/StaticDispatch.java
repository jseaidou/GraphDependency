package box.ast.nodes;

import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Base class for all static access
 * @author jseaidoun
 *
 */
public abstract class StaticDispatch extends Expression {
    private final Expression dispatcher;
    
    public StaticDispatch(int start, int end, Expression dispatcher) {
        super(start, end);
        assert (dispatcher != null);
        this.dispatcher = dispatcher;
    }
    
    public Expression getDispatcher() {
        return this.dispatcher;
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

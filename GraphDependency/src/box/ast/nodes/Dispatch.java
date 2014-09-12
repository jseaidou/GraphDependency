package box.ast.nodes;

import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Base class to represent method invocation and field access:
 * 1.   $a->$b
 * 2.   foo()->bar()
 * 3.   $myClass->foo()->bar()
 * 4.   A::$a->foo()
 * @author jseaidoun
 *
 */
public abstract class Dispatch extends Expression {
    private final Expression dispatcher;
    
    public Dispatch(int start, int end, Expression dispatcher) {
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

package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.CallArgumentsList;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a class instantiation. This class holds the class name as an 
 * expression and array of constructor parameters
 * 1.   new MyClass()
 * 2.   new $a('arg')
 * 3.   new foo()(1, $a);
 * @author jseaidoun
 *
 */
public class ClassInstanceCreation extends Expression {
    private final Expression className;
    private final CallArgumentsList ctorParams;
    
    public ClassInstanceCreation(int start, int end, Expression className, CallArgumentsList ctorParams) {
        super(start, end);
        assert ( (className != null) && (ctorParams != null ) );
        this.className = className;
        this.ctorParams = ctorParams;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            this.className.traverse(visitor);
            this.ctorParams.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    public Expression getClassName() {
        return this.className;
    }
    
    public CallArgumentsList getCtorParams() {
        return this.ctorParams;
    }

    @Override
    public int getKind() {
        return ASTNodeKinds.CLASS_INSTANCE_CREATION.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

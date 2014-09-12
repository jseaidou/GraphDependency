package box.ast.nodes;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a single array element:
 * Holds the key and value. Both are expressions
 * 1.   'such' => 'parse'
 * 2.   1,
 * 3.   $var
 * 4.   $b => foo()
 * 5.   1 => $class->func()
 * @author jseaidoun
 *
 */
public class ArrayElement extends ASTNode {
    private Expression key;
    private Expression value;
    /**
     * Constructor for when we have key => value
     * @param start
     * @param end
     * @param key
     * @param value
     */
    public ArrayElement(int start, int end, Expression key, Expression value) {
        super(start, end);
        assert value != null; // key can be null but value always non null
        this.key = key;
        this.value = value;
    }
    
    /**
     * Constructor for when key in array is null
     * @param start
     * @param end
     * @param value
     */
    public ArrayElement(int start, int end, Expression value) {
        this(start, end, null, value);
    }
    
    @Override
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            if(key != null) {
                key.traverse(visitor);
            }
            value.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    public int getKind() {
        return ASTNodeKinds.ARRAY_ELEMENT.ordinal();
    }
    
    public Expression getKey() {
        return this.key;
    }
    
    public Expression getValue() {
        return this.value;
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

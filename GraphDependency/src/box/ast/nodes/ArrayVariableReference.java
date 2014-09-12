package box.ast.nodes;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.DLTKToken;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.references.VariableKind;
import org.eclipse.dltk.ast.references.VariableReference;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Class represents a variable or index that point to array or hashtable:
 * 1.   $a[]
 * 2.   $a[1]
 * 3.   $a[$b]
 * 4.   $a['name']
 * @author jseaidoun
 *
 */
public class ArrayVariableReference extends VariableReference {
    private Expression index;
    private ArrayVariableRefEnum type;
    public ArrayVariableReference(DLTKToken token, Expression index, ArrayVariableRefEnum type) {
        super(token);
        this.index = index;
        this.type = type;
    }
    
    public ArrayVariableReference(int start, int end, String name, VariableKind kind, Expression index, ArrayVariableRefEnum type){
        super(start, end, name, kind);
        this.index = index;
        this.type = type;
    }
    
    public ArrayVariableReference(int start, int end, String name, Expression index, ArrayVariableRefEnum type){
        super(start, end, name);
        this.index = index;
        this.type = type;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            if(index != null) {
                index.traverse(visitor);
            }
        }
        visitor.endvisit(this);
    }
    
    public Expression getIndex() {
        return this.index;
    }
    
    public static String getType(int type) {
        return ArrayVariableRefEnum.getValue(type).toString();
    }
    
    public ArrayVariableRefEnum getType() {
        return type;
    }

    @Override
    public int getKind() {
        return ASTNodeKinds.ARRAY_ACCESS.ordinal();
    }
    
    public enum ArrayVariableRefEnum {
        ARRAY(0),
        HASHTABLE(1);
        
        private int value; 
        private static final Map<Integer, ArrayVariableRefEnum> lookup = new HashMap<Integer, ArrayVariableRefEnum>();
        
        static {
            for(ArrayVariableRefEnum c : ArrayVariableRefEnum.values()) {
                lookup.put(c.getValue(), c);
            }
        }
        
        private ArrayVariableRefEnum(int value) { 
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

        public static ArrayVariableRefEnum getValue(int value) {
            return lookup.get(value);
        }
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

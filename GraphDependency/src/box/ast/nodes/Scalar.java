package box.ast.nodes;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.StringLiteral;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a scalar value: 
 * 1.   'string'
 * 2.   1
 * 3.   1.3
 * 4.   __CLASS__
 * @author jseaidoun
 *
 */
public class Scalar extends StringLiteral {
    private final ScalarEnum type;
    
    public Scalar(int start, int end, String value, ScalarEnum type) {
        super(start, end, value);
        this.type = type;
    };
    
    public void traverse(ASTVisitor visitor) throws Exception {
        visitor.visit(this);
        visitor.endvisit(this);
    }
    
    public ScalarEnum getType() {
        return this.type;
    }
    
    public static String getType( int value) {
        return ScalarEnum.getValue(value).toString();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
    
    public enum ScalarEnum{
        INT(0),
        STRING(1),
        REAL(2),
        SYSTEM(3),
        UNKNOWN(4);
        
        private int value; 
        private static final Map<Integer, ScalarEnum> lookup = new HashMap<Integer, ScalarEnum>();
        
        static {
            for(ScalarEnum c : ScalarEnum.values()) {
                lookup.put(c.getValue(), c);
            }
        }
        
        private ScalarEnum(int value) { 
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

        public static ScalarEnum getValue(int value) {
            return lookup.get(value);
        }
    }
}

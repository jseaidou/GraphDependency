package box.ast.nodes;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a type casting expression:
 * 1.   (int) $a
 * 2.   (string) $b->foo()
 * @author jseaidoun
 *
 */
public class CastExpression extends Expression {
    private Expression expression;
    private CastEnum type;
    public CastExpression(int start, int end, Expression expr, CastEnum castType) {
        super(start, end);
        assert expr != null;
        this.expression = expr;
        this.type = castType;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            expression.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.CAST_EXPRESSION.ordinal();
    }

    public CastEnum getType() {
        return this.type;
    }

    public static String getType(int type) {
        return CastEnum.getValue(type).toString();
    }

    public Expression getExpression() {
        return this.expression;
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }

    public enum CastEnum {
        INT(0),
        REAL(1),
        STRING(2),
        ARRAY(3),
        OBJECT(4),
        BOOL(4),
        UNSET(5);

        private int value; 
        private static final Map<Integer, CastEnum> lookup = new HashMap<Integer, CastEnum>();
        
        static {
            for(CastEnum c : CastEnum.values()) {
                lookup.put(c.getValue(), c);
            }
        }
        
        private CastEnum(int value) { 
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

        public static CastEnum getValue(int value) {
            return lookup.get(value);
        }
    }
}

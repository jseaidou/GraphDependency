package box.ast.nodes;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a include, include_once, require, require_once expression:
 * 1.   include('myFile.php')
 * 2.   include_once($my_file);
 * 3.   require($myClass->getFileName() )
 * 4.   require_once(A::FILENAME);
 * @author jseaidoun
 *
 */
public class Include extends Expression {
    private final Expression expr;
    private final IncludeEnum type;
    
    public Include(int start, int end, Expression expr, IncludeEnum type) {
        super(start, end);
        assert (expr != null);
        this.expr = expr;
        this.type = type;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            this.expr.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    public Expression getExpression() {
        return this.expr;
    }
    
    public IncludeEnum getType(){
        return this.type;
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.INCLUDE.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
    
    public enum IncludeEnum {
        INCLUDE(0),
        INCLUDE_ONCE(1),
        REQUIRE(2),
        REQUIRE_ONCE(2);
        
        private int value; 
        private static final Map<Integer, IncludeEnum> lookup = new HashMap<Integer, IncludeEnum>();
        
        static {
            for(IncludeEnum c : IncludeEnum.values()) {
                lookup.put(c.getValue(), c);
            }
        }
        
        private IncludeEnum(int value) { 
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

        public static IncludeEnum getValue(int value) {
            return lookup.get(value);
        }
    }
}

package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a indirect reference to a array variable:
 * 1. $$a[3]
 * @author jseaidoun
 *
 */
public class ReflectionArrayVariableReference extends ReflectionVariableReference {
    private final Expression index;
    private final ReflectionArrayEnum type;
    
    public ReflectionArrayVariableReference(int start, int end, Expression name, Expression index, ReflectionArrayEnum arrayType){
        super(start, end, name);
        this.index = index;
        this.type = arrayType;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            getExpression().traverse(visitor);
            if(index != null) {
                this.index.traverse(visitor);;
            }
        }
        visitor.endvisit(this);
    }
    
    public ReflectionArrayEnum getType() {
        return this.type;
    }
    
    public Expression getIndex() {
        return this.index;
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.REFLECTION_ARRAY_ACCESS.ordinal();
    }
    public enum ReflectionArrayEnum {
        ARRAY,
        HASHTABLE;
    }
}

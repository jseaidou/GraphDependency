package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.DLTKToken;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a indirect reference to a variable
 * 1.   $$a
 * 2.   $$foo()
 * 3.   ${foo()}
 * @author jseaidoun
 *
 */
public class ReflectionVariableReference extends Expression {
    private Expression expression;
    
    public ReflectionVariableReference(int start, int end, Expression name) {
        super(start, end);
        assert (expression != null);
        this.expression = name;
    }
    
    public ReflectionVariableReference(DLTKToken token){
        super(token);
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            this.expression.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    public Expression getExpression() {
        return this.expression;
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.REFLECTION_VARIABLE.ordinal();
    }

}

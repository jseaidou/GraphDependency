package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.declarations.Argument;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.references.SimpleReference;
import org.eclipse.dltk.ast.references.VariableReference;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a function formal parameter:
 * 1.   foo($a)
 * 2.   foo(MyClass $a)
 * 3.   foo($a = 3)
 * 4.   foo(int $a = 3)
 * @author jseaidoun
 *
 */
public class FunctionFormalParameter extends Argument {
    private final SimpleReference parameterType;
    private final VariableReference parameterName;
    private final boolean isMandatory;
    
    public FunctionFormalParameter(int start, int end, SimpleReference type, final VariableReference parameterName, boolean isMandatory) {
        this(start, end, type, parameterName, null, isMandatory);
    }
    
    public FunctionFormalParameter(int start, int end, SimpleReference type, final VariableReference parameterName, Expression defaultValue){
        this(start, end, type, parameterName, defaultValue, false);
    }
    
    public FunctionFormalParameter(int start, int end, SimpleReference type, final VariableReference parameterName){
        this(start, end, type, parameterName, null, true);
    }
    
    private FunctionFormalParameter(int start, int end, SimpleReference type, final VariableReference parameterName, Expression defaultValue, boolean isMandatory) {
        super(parameterName, start, end, defaultValue, 0);
        
        assert (parameterName != null);
        
        SimpleReference ref = getRef();
        if(ref != null) {
            ref.setStart(parameterName.sourceStart());
            ref.setEnd(parameterName.sourceEnd());
        }
        
        this.parameterType = type;
        this.parameterName = parameterName;
        this.isMandatory = isMandatory;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            if(this.parameterType != null) {
                this.parameterType.traverse(visitor);
            }
            this.parameterName.traverse(visitor);
            Expression defaultValue = (Expression) getInitialization();
            if(defaultValue != null) {
                defaultValue.traverse(visitor);
            }
        }
        visitor.endvisit(this);
    }
    
    public SimpleReference getType() {
        return this.parameterType;
    }
    
    public VariableReference getParameterName() {
        return this.parameterName;
    }
    
    public boolean getIsMandatory() {
        return this.isMandatory;
    }
    
    public int getKind() {
        return ASTNodeKinds.FORMAL_PARAMETER.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

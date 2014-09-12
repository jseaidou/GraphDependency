package box.ast.nodes;

import org.eclipse.dltk.ast.references.*;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

public class FunctionFormalParameterByReference extends FunctionFormalParameter {
    public FunctionFormalParameterByReference(int start, int end, SimpleReference type, VariableReference parameterName, Expression defaultValue) {
        super(start, end, type, parameterName, defaultValue);
    }

    public FunctionFormalParameterByReference(int start, int end, SimpleReference type, VariableReference parameterName, boolean isMandatory) {
        super(start, end, type, parameterName, isMandatory);
    }

    public FunctionFormalParameterByReference(int start, int end, SimpleReference type, VariableReference parameterName) {
        super(start, end, type, parameterName);
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.FORMAL_PARAMETER_BYREF.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

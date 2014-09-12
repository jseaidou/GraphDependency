package box.ast.nodes.php;

import org.eclipse.dltk.ast.references.TypeReference;
import org.eclipse.dltk.ast.references.VariableReference;

import box.ast.nodes.Comment;
import box.ast.visitor.ASTPrintVisitor;

public class VarComment extends Comment {
    private VariableReference variableReference;
    private TypeReference typeReference;
    
    public VarComment(int start, int end, VariableReference variableReference, TypeReference typeReference) {
        super(start, end, CommentEnum.MULTI_LINE);
        this.variableReference = variableReference;
        this.typeReference = typeReference;
    }

    public VariableReference getVariableReference() {
        return variableReference;
    }

    public TypeReference getTypeReference() {
        return typeReference;
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

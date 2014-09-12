package box.ast.nodes;

import org.eclipse.dltk.ast.expressions.CallArgumentsList;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

public class ReflectionStaticMethodInvocation extends ReflectionCallExpression {
    public ReflectionStaticMethodInvocation(int start, int end, Expression receiver, Expression name, CallArgumentsList args) {
        super(start, end, receiver, name, args);
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
    
    public int getKind() {
        return ASTNodeKinds.REFLECTION_STATIC_METHOD_INVOCATION.ordinal();
    }
}

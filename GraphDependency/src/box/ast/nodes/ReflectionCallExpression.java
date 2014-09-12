package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.CallArgumentsList;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

public class ReflectionCallExpression extends Expression {
    private Expression receiver;
    private Expression name;
    private final CallArgumentsList args;
    
    public ReflectionCallExpression(int start, int end, Expression receiver, Expression name, CallArgumentsList args){
        super(start, end);
        assert (name != null);
        if(args == null) {
            args = new CallArgumentsList();
        }
        this.receiver = receiver;
        this.name = name;
        this.args = args;
    }

    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            if(this.receiver != null) {
                this.receiver.traverse(visitor);
            }
            this.name.traverse(visitor);
            this.args.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    public Expression getName() {
        return this.name;
    }
    
    public CallArgumentsList getArgs() {
        return this.args;
    }
    
    public Expression getReceiver() {
        return this.receiver;
    }
    
    public void setReceiver(Expression receiver) {
        assert (receiver != null);
        this.receiver = receiver;
        setStart(receiver.sourceStart());
    }
    
    public int getKind() {
        return ASTNodeKinds.REFLECTION_CALL_EXPRESSION.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

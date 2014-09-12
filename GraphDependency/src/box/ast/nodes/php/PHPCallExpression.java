package box.ast.nodes.php;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.CallArgumentsList;
import org.eclipse.dltk.ast.expressions.CallExpression;
import org.eclipse.dltk.ast.references.SimpleReference;

import box.ast.nodes.ASTNodeKinds;
import box.ast.visitor.ASTPrintVisitor;

public class PHPCallExpression extends CallExpression {
    public PHPCallExpression(int start, int end, ASTNode receiver, String name, CallArgumentsList args) {
        super(start, end, receiver, name, args);
    }

    public PHPCallExpression(int start, int end, ASTNode receiver, SimpleReference name, CallArgumentsList args) {
        super(start, end, receiver, name, args);
    }

    public PHPCallExpression(ASTNode receiver, String name, CallArgumentsList args) {
        super(receiver, name, args);
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            if(this.receiver != null) {
                this.receiver.traverse(visitor);
            }
            getCallName().traverse(visitor);
            CallArgumentsList args = getArgs();
            if(args != null){
                args.traverse(visitor);
            }
        }
        visitor.endvisit(this);
    }
    
    public int getKind() {
        return ASTNodeKinds.METHOD_INVOCATION.ordinal();
    }

    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

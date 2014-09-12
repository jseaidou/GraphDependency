package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.references.ConstantReference;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a constant class access
 * 1.   MyClass::CONST
 * @author jseaidoun
 *
 */
public class ConstStaticAccess extends StaticDispatch {
    private final ConstantReference constant;
    
    public ConstStaticAccess(int start, int end, Expression dispatcher, ConstantReference constant) {
        super(start, end, dispatcher);
        assert (constant != null);
        this.constant = constant;
    }

    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            getDispatcher().traverse(visitor);
            constant.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    public ConstantReference getConstant() {
        return this.constant;
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.STATIC_CONSTANT_ACCESS.ordinal();
    };
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

package box.ast.nodes;

import java.util.List;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.statements.Statement;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a use statement:
 * 1.   use A;
 * 2.   use A as B;
 * 3.   use \A\B as C;
 * @author jseaidoun
 *
 */
public class UseStatement extends Statement {
    private List<UsePart> parts;
    
    public UseStatement(int start, int end, List<UsePart> parts) {
        super(start, end);
        assert (parts != null);
        this.parts = parts;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            for(UsePart u : this.parts) {
                u.traverse(visitor);
            }
        }
        visitor.endvisit(this);
    }
    
    public List<UsePart> getParts() {
        return parts;
    }

    @Override
    public int getKind() {
        return ASTNodeKinds.USE_STATEMENT.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }

}

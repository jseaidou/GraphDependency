package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.statements.Statement;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a empty statement:
 * 1.   while(true); - Empty body in while loop for example
 * @author jseaidoun
 *
 */
public class EmptyStatement extends Statement {
    public EmptyStatement(int start, int end) {
        super(start, end);
    }

    public void traverse(ASTVisitor visitor) throws Exception {
        visitor.visit(this);
        visitor.endvisit(this);
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.EMPTY_STATEMENT.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

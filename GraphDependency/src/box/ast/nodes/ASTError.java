package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.statements.Statement;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a parsing error
 * 1.   for() {}    - No arguments to for statement
 * 2.   echo;       - empty echo
 * @author jseaidoun
 *
 */
public class ASTError extends Statement {
    public ASTError(int start, int end) {
        super(start, end);
    }

    public void traverse(ASTVisitor visitor) throws Exception{
        visitor.visit(this);
        visitor.endvisit(this);
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.AST_ERROR.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

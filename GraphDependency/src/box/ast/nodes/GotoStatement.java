package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.statements.Statement;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a goto statement:
 * 1.   goto LABEL;
 * @author jseaidoun
 *
 */
public class GotoStatement extends Statement {
    private String label;
    
    public GotoStatement(int start, int end, String label) {
        super(start, end);
        this.label = label;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        visitor.visit(this);
        visitor.endvisit(this);
    }
    
    public String getLabel() {
        return label;
    }
    
    public int getKind() {
        return ASTNodeKinds.GOTO_STATEMENT.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

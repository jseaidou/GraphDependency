package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.statements.Statement;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a goto label:
 * 1.   LABEL:
 * @author jseaidoun
 *
 */
public class GotoLabel extends Statement {
    private String label;
    
    public GotoLabel(int start, int end, String label) {
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
        return ASTNodeKinds.GOTO_LABEL.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

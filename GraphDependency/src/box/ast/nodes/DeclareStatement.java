package box.ast.nodes;

import java.util.List;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Statement;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a declare statement:
 * 1.   declare(ticks = 1) {}
 * 2.   declare(ticks = 2) { for($x = 1; $x < 50; $x++) {} }
 * @author jseaidoun
 *
 */
public class DeclareStatement extends Statement {
    private final List<String> directiveNames;
    private final List<? extends Expression> directiveValues;
    private final Statement action;
    public DeclareStatement(int start, int end, List<String> directiveNames, List<? extends Expression> directiveValues, Statement action) {
        super(start, end);
        assert( (directiveNames != null) && (directiveValues != null) && (directiveNames.size() == directiveValues.size() ) && (action != null) );
        this.directiveNames = directiveNames;
        this.directiveValues = directiveValues;
        this.action = action;
    }

    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            for(Expression e : this.directiveValues) {
                e.traverse(visitor);
            }
            action.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    public List<String> getDirectiveNames() {
        return this.directiveNames;
    }
    
    public List<? extends Expression> getDirectiveValues() {
        return this.directiveValues;
    }
    
    public Statement getAction() {
        return this.action;
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.DECLARE_STATEMENT.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

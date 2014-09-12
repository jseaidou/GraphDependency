package box.ast.nodes;

import java.util.List;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Statement;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a case statement, part of a switch statement:
 * 1.   case expr:
 *          statements;
 *          break;
 *      default:
 *          statements;
 * @author jseaidoun
 *
 */
public class SwitchCase extends Statement {
    private final Expression value;
    private final List<? extends Expression> actions;
    private final boolean isDefault;
    
    public SwitchCase(int start, int end, Expression value, List<? extends Expression> actions, boolean isDefault) {
        super(start, end);
        assert (actions != null);
        this.value = value;
        this.actions = actions;
        this.isDefault = isDefault;
    }

    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            if(this.value != null) {
                this.value.traverse(visitor);
            }
            for(Statement e : this.actions) {
                e.traverse(visitor);
            }
        }
        visitor.endvisit(this);
    }
    
    public Expression getValue() {
        return value;
    }

    public List<? extends Expression> getActions() {
        return actions;
    }

    public boolean isDefault() {
        return isDefault;
    }

    @Override
    public int getKind() {
        return ASTNodeKinds.IF_STATEMENT.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

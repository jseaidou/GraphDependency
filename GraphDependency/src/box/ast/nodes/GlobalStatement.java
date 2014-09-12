package box.ast.nodes;

import java.util.List;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Statement;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a global statement:
 * 1.   global $a;
 * 2.   global $a, $b;
 * 3.   global ${foo()->bar()};
 * 4.   global $$a
 * @author jseaidoun
 *
 */
public class GlobalStatement extends Statement {
    private final List<? extends Expression> variables;
    public GlobalStatement(int start, int end, List<? extends Expression> variables) {
        super(start, end);
        assert(variables != null);
        this.variables = variables;
    }

    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            for(Expression e : this.variables ) {
                e.traverse(visitor);
            }
        }
        visitor.endvisit(this);
    }
    
    public List<? extends Expression> getVariables() {
        return this.variables;
    }
    @Override
    public int getKind() {
        return ASTNodeKinds.GLOBAL_STATEMENT.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

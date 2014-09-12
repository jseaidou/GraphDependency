package box.ast.nodes;

import java.util.List;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a list expression:
 * 1.   list($a, $b) = array (1,2)
 * 2.   list($a, list($b, $c)) 
 * @author jseaidoun
 *
 */
public class ListVariable extends Expression {
    private final List<? extends Expression> variables;
    public ListVariable(int start, int end, List<? extends Expression> variables) {
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
        return ASTNodeKinds.LIST_VARIABLE.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

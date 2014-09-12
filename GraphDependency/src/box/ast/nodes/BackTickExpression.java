package box.ast.nodes;

import java.util.List;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents back tick expressions:
 * 1.   `./exec.sh`
 * @author jseaidoun
 *
 */
public class BackTickExpression extends Expression {
    private List<? extends Expression> expressions;
    
    public BackTickExpression(int start, int end, List<? extends Expression> expressions) {
        super(start, end);
        assert expressions != null;
        this.expressions = expressions;
    }

    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            for(Expression e : this.expressions ) {
                e.traverse(visitor);
            }
        }
        visitor.endvisit(this);
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.BACK_TICK_EXPRESSION.ordinal();
    }
    
    public List<? extends Expression> getExpressions() {
        return this.expressions;
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

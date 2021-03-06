package box.ast.nodes;

import java.util.List;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Statement;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a static statement
 * 1.   static $a
 * 2.   static $a, $b = 5
 * @author jseaidoun
 *
 */
public class StaticStatement extends Statement {
    private final List<? extends Expression> expressions;
    
    public StaticStatement(int start, int end, List<? extends Expression> expressions) {
        super(start, end);
        assert(expressions != null);
        this.expressions = expressions;
    }

    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            for(Expression e : this.expressions) {
                e.traverse(visitor);
            }
        }
        visitor.endvisit(this);
    }
    
    public List<? extends Expression> getExpressions() {
        return this.expressions;
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.STATIC_STATEMENT.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

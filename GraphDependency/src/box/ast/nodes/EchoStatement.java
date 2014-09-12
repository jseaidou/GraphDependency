package box.ast.nodes;

import java.util.List;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Statement;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a echo statement;
 * 1.   echo "hello";
 * 2.   echo "hello", "world";
 * @author jseaidoun
 *
 */
public class EchoStatement extends Statement{
    private final List<? extends Expression> expressions;
    public EchoStatement(int start, int end, List<? extends Expression> expressions) {
        super(start, end);
        assert (expressions != null);
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
    
    public List<? extends Expression> getExpressions() {
        return this.expressions;
    }

    @Override
    public int getKind() {
        return ASTNodeKinds.ECHO_STATEMENT.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

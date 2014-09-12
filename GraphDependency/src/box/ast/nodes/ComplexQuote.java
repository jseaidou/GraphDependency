package box.ast.nodes;

import java.util.List;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a complex quote. 
 * 1.   "this is $a quote"
 * 2.   "'single ${$complex->quote()}'"
 * 3.   >>>Heredoc\n Thisi is here documents \nHeredoc;\n
 * 4.   "This is".$not." a quote node"
 * 5.   'This is $not a quote'
 * @author jseaidoun
 *
 */
public class ComplexQuote extends Expression {
    public static final int QUOTE = 0;
    public static final int SINGLE = 1;
    public static final int HEREDOC = 2;
    public static final int NOWDOC = 3;

    private final List<? extends Expression> expressions;
    private final int type;

    public ComplexQuote(int start, int end, List<? extends Expression> expressions, int type) {
        super(start, end);
        this.expressions = expressions;
        this.type = type;
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
    
    public int getType() {
        return this.type;
    }

    public static String getType(int type) {
        switch (type) {
        case QUOTE:
            return "quote";
        case SINGLE:
            return "single"; 
        case HEREDOC:
            return "heredoc";
        case NOWDOC:
            return "nowdoc"; 
        default:
            throw new IllegalArgumentException();
        }
    }

    public List<? extends Expression> getExpressions() {
        return this.expressions;
    }
    @Override
    public int getKind() {
        return ASTNodeKinds.QUOTE.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

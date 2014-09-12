package box.ast.nodes;

import java.util.List;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Statement;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a for statement:
 * 1.   for(expr1; expr2; expr3) statements;
 * 2.   for(expr1; expr2; expr3) statements; endfor;
 * @author jseaidoun
 *
 */
public class ForStatement extends Statement {
    private final List<? extends Expression> initializations;
    private final List<? extends Expression> conditions;
    private final List<? extends Expression> increasements;
    private final Statement action;
    
    public ForStatement(int start, int end, List<? extends Expression> initializations, List<? extends Expression> conditions, List<? extends Expression> increasements, Statement action) {
        super(start, end);
        assert initializations != null && conditions != null && increasements != null && action != null;
        this.initializations = initializations;
        this.conditions = conditions;
        this.increasements = increasements;
        this.action = action;
    }

    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            for(Expression e : this.initializations) {
                e.traverse(visitor);
            }
            for(Expression e : this.conditions) {
                e.traverse(visitor);
            }
            for(Expression e : this.increasements) {
                e.traverse(visitor);
            }
            this.action.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    public List<? extends Expression> getInitializations() {
        return this.initializations;
    }
    
    public List<? extends Expression> getConditions() {
        return this.conditions;
    }
    
    public List<? extends Expression> getIncreasements() {
        return this.increasements;
    }
    
    public Statement getAction() {
        return this.action;
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.FOR_STATEMENT.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

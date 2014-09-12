package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Statement;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a for each statement:
 * 1.   foreach(arr as $value) statements;
 * 2.   foreach(arr as $key => $value) statements;
 * 3.   foreach(arr as $key => $value): statements; endforeach;
 * @author jseaidoun
 *
 */
public class ForEachStatement extends Statement {
    private final Expression expression;
    private final Expression key;
    private final Expression value;
    private final Statement statement;
    
    public ForEachStatement(int start, int end, Expression expression, Expression key, Expression value, Statement statement) {
        super(start, end);
        assert ( (expression != null) && (value != null) && (statement != null ));
        this.expression = expression;
        this.key = key;
        this.value = value;
        this.statement = statement;
    }

    public ForEachStatement(int start, int end, Expression expression, Expression value, Statement statement) {
        this(start, end, expression, null, value, statement);
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            this.expression.traverse(visitor);
            if(this.key != null) {
                this.key.traverse(visitor);
            }
            this.value.traverse(visitor);
            this.statement.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    public Expression getExpression() {
        return this.expression;
    }
    
    public Expression getKey() {
        return this.key;
    }
    
    public Expression getValue() {
        return this.value;
    }
    
    public Statement getStatement() {
        return this.statement;
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.FOR_EACH_STATEMENT.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

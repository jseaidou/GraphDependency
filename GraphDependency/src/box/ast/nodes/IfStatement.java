package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Statement;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a if statement:
 * 1.   if($a > $b) {
 *          echo "a is bigger";
 *      } elseif( $a == $b) {
 *          echo "a is equal";
 *      } else {
 *          echo "a is smaller"
 *      }
 *
 *2.    if($a):
 *          echo "in if statement";
 *      endif
 * @author jseaidoun
 *
 */
public class IfStatement extends Statement {
    private final Expression condition;
    private final Statement trueStatement;
    private final Statement falseStatement;
    
    public IfStatement(int start, int end, Expression condition, Statement trueStatement, Statement falseStatement) {
        super(start, end);
        
        assert ((condition != null) && (trueStatement != null) );
        this.condition = condition;
        this.trueStatement = trueStatement;
        this.falseStatement = falseStatement;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            this.condition.traverse(visitor);
            this.trueStatement.traverse(visitor);
            if(this.falseStatement != null) {
                this.falseStatement.traverse(visitor);
            }
        }
        visitor.endvisit(this);
    }
    
    public Expression getCondition() {
        return this.condition;
    }
    
    public Statement getTrueStatement() {
        return this.trueStatement;
    }
    
    public Statement getFalseStatement() {
        return this.falseStatement;
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

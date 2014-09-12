package box.ast.nodes;

import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Statement;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a Do-while loop:
 * 1.   do { $x++}while($x < 10);
 * @author jseaidoun
 *
 */
public class DoWhileStatement extends WhileStatement {
    public DoWhileStatement(int start, int end, Expression condition, Statement body) {
        super(start, end, condition, body);
    }

    @Override
    public int getKind() {
        return ASTNodeKinds.DO_STATEMENT.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

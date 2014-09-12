package box.ast.nodes;

import java.util.List;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.statements.Block;
import org.eclipse.dltk.ast.statements.Statement;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a try statement:
 * 1.   try {
 *          statements;
 *      }catch (...)...
 * @author jseaidoun
 *
 */
public class TryStatement extends Statement {
    private final Block tryStatement;
    private final List<CatchStatement> catchStatements;
    public TryStatement(int start, int end, Block tryStatement, List<CatchStatement> catchStatement) {
        super(start, end);
        assert ((tryStatement != null) && (catchStatement != null) );
        this.tryStatement = tryStatement;
        this.catchStatements = catchStatement;
    }

    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            this.tryStatement.traverse(visitor);
            for(CatchStatement c : this.catchStatements) {
                c.traverse(visitor);
            }
        }
        visitor.endvisit(this);
    }
    
    public Block getTryStatement() {
        return this.tryStatement;
    }

    public List<CatchStatement> getCatchStatements() {
        return this.catchStatements;
    }

    @Override
    public int getKind() {
        return ASTNodeKinds.TRY_STATEMENT.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

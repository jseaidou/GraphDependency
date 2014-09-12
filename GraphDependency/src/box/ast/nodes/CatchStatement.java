package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.references.TypeReference;
import org.eclipse.dltk.ast.references.VariableReference;
import org.eclipse.dltk.ast.statements.Block;
import org.eclipse.dltk.ast.statements.Statement;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a catch statement as part of a try statement:
 * 1.   catch (ClassName $var){}
 * @author jseaidoun
 *
 */
public class CatchStatement extends Statement {
    private TypeReference className;
    private VariableReference variable;
    private Block statement;
    public CatchStatement(int start, int end, TypeReference className, VariableReference variable, Block statement) {
        super(start, end);
        assert( (className != null) && (variable != null) && (statement != null) );
        this.className = className;
        this.variable = variable;
        this.statement = statement;
    }

    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            this.className.traverse(visitor);
            this.variable.traverse(visitor);
            this.statement.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.CATCH_CLAUSE.ordinal();
    }
    
    public TypeReference getClassName(){
        return this.className;
    }
    
    public VariableReference getVariable() {
        return this.variable;
    }
    
    public Block getStatement() {
        return this.statement;
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

package box.ast.nodes;

import java.util.List;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents array creation:
 * 1.   array(1,2,3,...)
 * 2.   array('such' => 'wow', 'much' => 'parse' )
 * 3.   array($a, $b => c(), 1 => $Class->func() ) 
 * @author jseaidoun
 *
 */
public class ArrayCreation extends Expression {
    private List<ArrayElement> elements;
    public ArrayCreation(int start, int end, List<ArrayElement> elements){
        super(start, end);
        assert elements != null;
        this.elements = elements;
    }

    public List<ArrayElement> getElements() {
        return this.elements;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            for(ArrayElement element : elements) {
                element.traverse(visitor);;
            }
        }
        visitor.endvisit(this);
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.ARRAY_CREATION.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

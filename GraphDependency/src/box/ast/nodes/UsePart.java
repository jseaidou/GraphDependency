package box.ast.nodes;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.references.SimpleReference;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a use part statement:
 * 1.   A as B
 * 2.   \A\B as C
 * @author jseaidoun
 *
 */
public class UsePart extends ASTNode {
    private FullyQualifiedReference namespace;
    private SimpleReference alias;
    
    public UsePart(FullyQualifiedReference namespace, SimpleReference alias) {
        this.namespace = namespace;
        this.alias = alias;
    }
    
    @Override
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            if(this.namespace != null) {
                this.namespace.traverse(visitor);
            }
            if(this.alias != null) {
                this.alias.traverse(visitor);
            }
        }
        visitor.endvisit(this);
    }

    public FullyQualifiedReference getNamespace() {
        return namespace;
    }

    public SimpleReference getAlias() {
        return alias;
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

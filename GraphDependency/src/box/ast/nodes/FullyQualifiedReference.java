package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.DLTKToken;
import org.eclipse.dltk.ast.references.TypeReference;

import box.ast.visitor.ASTPrintVisitor;

/**
 * This is a reference to the PHP element name which has a namespace prefix in it
 * @author jseaidoun
 *
 */
public class FullyQualifiedReference extends TypeReference {
    private NamespaceReference namespace;
    
    public FullyQualifiedReference(DLTKToken token){
        super(token);
    }

    public FullyQualifiedReference(int start, int end, String name, NamespaceReference namespace) {
        super(start, end, name);
        this.namespace = namespace;
    }
    
    public NamespaceReference getNamespace() {
        return namespace;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            if(this.namespace != null) {
                this.namespace.traverse(visitor);
            }
        }
        visitor.endvisit(this);
    }
    
    /**
     * Returns the full name including the namespace prefix 
     * @return
     */
    public String getFullyQualifiedName() {
        if (namespace == null) {
            return getName();
        }
        
        StringBuilder buf = new StringBuilder(namespace.getName())
            .append(NamespaceReference.SEPARATOR).append(getName());
        
        return buf.toString();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

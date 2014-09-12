package box.ast.nodes;

import org.eclipse.dltk.ast.DLTKToken;
import org.eclipse.dltk.ast.references.TypeReference;

import box.ast.visitor.ASTPrintVisitor;

/**
 * This is a reference to a namespace or to a namespace alias
 * @author jseaidoun
 *
 */
public class NamespaceReference extends TypeReference {
    public final static char SEPARATOR = '\\';
    private boolean global;
    private boolean local;
    
    public NamespaceReference(DLTKToken token) {
        super(token);
    }
    
    public NamespaceReference(int start, int end, String name) {
        super(start, end, name);
    }
    
    public NamespaceReference(int start, int end, String name, boolean global, boolean local) {
        super(start, end, name);
        this.global = global;
        this.local = local;
    }
    
    public boolean isGlobal() {
        return this.global;
    }
    
    public boolean isLocal() {
        return this.local;
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

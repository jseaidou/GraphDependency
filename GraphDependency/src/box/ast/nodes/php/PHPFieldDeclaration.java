package box.ast.nodes.php;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.Modifiers;
import org.eclipse.dltk.ast.declarations.FieldDeclaration;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.references.VariableReference;

import box.ast.visitor.ASTPrintVisitor;

public class PHPFieldDeclaration extends FieldDeclaration {
    private int declStart;
    private Expression initializer;
    private PHPDocBlock phpDoc;

    public PHPFieldDeclaration(VariableReference variable, Expression initializer, int start, int end, int modifiers, int declStart, PHPDocBlock phpDoc) {
        super(variable.getName(), variable.sourceStart(), variable.sourceEnd(), start, end);
        if( ( (modifiers & Modifiers.AccPrivate) == 0 ) && ( (modifiers & Modifiers.AccProtected) == 0) ) {
            modifiers |= Modifiers.AccPublic;
        }
        
        setModifiers(modifiers);
        this.declStart = declStart;
        this.initializer = initializer;
        this.phpDoc = phpDoc;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            getRef().traverse(visitor);
            if(this.initializer != null) {
                this.initializer.traverse(visitor);
            }
        }
        visitor.endvisit(this);
    }
    
    public int getDeclStart() {
        return declStart;
    }

    public Expression getInitializer() {
        return initializer;
    }

    public PHPDocBlock getPhpDoc() {
        return phpDoc;
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

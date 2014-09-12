package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.declarations.Declaration;
import org.eclipse.dltk.ast.references.ConstantReference;

import box.ast.nodes.php.PHPDocBlock;
import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a class/namespace constant declaration
 * 1.   const MY_CONST = 5;
 * 2.   const MY_CONST = 5, YOUR_CONST = 8;
 * @author jseaidoun
 *
 */
public class ConstantDeclaration extends Declaration {
    private final ConstantReference constant;
    private final Expression initializer;
    private PHPDocBlock phpDoc;
    
    public ConstantDeclaration(ConstantReference constant, Expression initializer, int start, int end, PHPDocBlock phpDoc) {
        super(start, end);
        assert ( (constant != null) && (initializer != null) );
        this.constant = constant;
        this.initializer = initializer;
        this.phpDoc = phpDoc;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            this.constant.traverse(visitor);
            this.initializer.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    public PHPDocBlock getPHPDoc() {
        return this.phpDoc;
    }
    
    public Expression getConstantValue() {
        return this.initializer;
    }
    
    public ConstantReference getConstant() {
        return this.constant;
    }
    
    public int getKind() {
        return ASTNodeKinds.CLASS_CONSTANT_DECLARATION.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

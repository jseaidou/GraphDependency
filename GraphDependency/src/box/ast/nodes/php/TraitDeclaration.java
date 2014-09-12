package box.ast.nodes.php;

import org.eclipse.dltk.ast.declarations.TypeDeclaration;
import org.eclipse.dltk.ast.statements.Block;

import box.ast.nodes.ASTNodeKinds;
import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a trait declaration:
 * 1.   trait MyTrait {}
 * 2.   trait MyTrait { 
 *          public function1(){} 
 *      }
 * @author jseaidoun
 *
 */
public class TraitDeclaration extends TypeDeclaration{
    private PHPDocBlock phpDoc;
    public TraitDeclaration(int start, int end, int nameStart, int nameEnd, String traitName, Block body, PHPDocBlock phpDoc) {
        super(traitName, nameStart, nameEnd, start, end);
        this.phpDoc = phpDoc;
        this.setBody(body);
    }
    
    public PHPDocBlock getPHPDoc() {
        return this.phpDoc;
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.TRAIT_DECLARATION.ordinal();
    }
    
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

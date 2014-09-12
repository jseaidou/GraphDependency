package box.ast.nodes;

import java.util.List;

import org.eclipse.dltk.ast.ASTListNode;
import org.eclipse.dltk.ast.Modifiers;
import org.eclipse.dltk.ast.declarations.TypeDeclaration;
import org.eclipse.dltk.ast.references.TypeReference;
import org.eclipse.dltk.ast.statements.Block;

import box.ast.nodes.php.PHPDocBlock;
import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a interface declaration:
 * 1.   interface MyInterface {}
 * 2.   interface MyInterface extends Inteface1, Interface2 {}
 * @author jseaidoun
 *
 */
public class InterfaceDeclaration extends TypeDeclaration {
    private PHPDocBlock phpDoc;
    
    public InterfaceDeclaration(int start, int end, int nameStart, int nameEnd, String interfaceName, List<TypeReference> interfaces, Block body, PHPDocBlock phpDoc) {
        super(interfaceName, nameStart, nameEnd, start, end);
        this.phpDoc = phpDoc;
        ASTListNode parentsList = new ASTListNode(start,  end);
        for(TypeReference intface : interfaces) {
            parentsList.addNode(intface);
        }
        
        if(parentsList.getChilds().size() > 0 ) {
            setSuperClasses(parentsList);
        }
        
        setBody(body);
        
        setModifier(Modifiers.AccInterface);
    }
    
    public PHPDocBlock getPHPDoc() {
        return this.phpDoc;
    }

    @Override
    public int getKind() {
        return ASTNodeKinds.INTERFACE_DECLARATION.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

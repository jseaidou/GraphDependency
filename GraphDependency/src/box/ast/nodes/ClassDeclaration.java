package box.ast.nodes;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.dltk.ast.ASTListNode;
import org.eclipse.dltk.ast.declarations.TypeDeclaration;
import org.eclipse.dltk.ast.references.TypeReference;
import org.eclipse.dltk.ast.statements.Block;

import box.ast.nodes.php.PHPDocBlock;
import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a class declaration:
 * 1.   class MyClass {}
 * 2.   class MyClass extends SuperClass implements Interface1, Interface2 {
 *          const MY_CONSTANT = 0;
 *          public static final $myVar = 5, $yourvar;
 *          var $anotherOne;
 *          private function myFunction($a) {}
 *      }
 * @author jseaidoun
 *
 */
public class ClassDeclaration extends TypeDeclaration {
    private TypeReference superClass;
    private List<TypeReference> interfaceList;
    private PHPDocBlock phpDoc;
    public ClassDeclaration(int start, int end, int nameStart, int nameEnd, int modifier, String className, TypeReference superClass, List<TypeReference> interfaces, Block body, PHPDocBlock phpDoc) {
        super(className, nameStart, nameEnd, start, end);
        this.setModifiers(modifier);
        this.phpDoc = phpDoc;
        this.superClass = superClass;
        this.interfaceList = interfaces;
        this.setBody(body);
    }
    
    public void setInterfaceList(List<TypeReference> interfaceList) {
        this.interfaceList = interfaceList;
    }
    
    public void addInterface(TypeReference newInterface) {
        if(this.interfaceList == null ){
            interfaceList = new LinkedList<TypeReference>();
        }
        interfaceList.add(newInterface);
    }
    
    public final void setSuperClasses(ASTListNode exprList) {
        throw new IllegalStateException("Use setSuperClass() or setInterfaceList()/addInterface() instead");
    }
    
    public void setSuperClass(TypeReference superClass) {
        this.superClass = superClass;
    }
    
    public TypeReference getSuperClass() {
        return this.superClass;
    }
    
    public List<TypeReference> getInterfaceList() {
        return this.interfaceList;
    }
    
    public PHPDocBlock getPHPDoc() {
        return this.phpDoc;
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.CLASS_DECLARATION.ordinal();
    }
    
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
    
    public enum ClassDeclarationModifierEnum {
        NONE,
        ABSTRACT,
        FINAL;
    }
}

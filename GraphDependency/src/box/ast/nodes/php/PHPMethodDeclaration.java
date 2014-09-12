package box.ast.nodes.php;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.dltk.ast.Modifiers;
import org.eclipse.dltk.ast.declarations.MethodDeclaration;
import org.eclipse.dltk.ast.statements.Block;

import box.ast.nodes.FunctionFormalParameter;
import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a function declaration of the following:
 * function foo(){}
 * function &foo(){}
 * function foo($a, int $b, $c=5, int $d = 6){}
 * function foo(); (abstract function in class declaration)
 * @author jseaidoun
 *
 */
public class PHPMethodDeclaration extends MethodDeclaration {
    private static final List<FunctionFormalParameter> EMPTY_PARAMETERS = new LinkedList<FunctionFormalParameter>();
    private final boolean isReference;
    private PHPDocBlock phpDoc;
    
    public PHPMethodDeclaration(int start, int end, int nameStart, int nameEnd, String functionName, int modifiers, List<FunctionFormalParameter> formalParameters, Block body, final boolean isReference, PHPDocBlock phpDoc) {
        super(functionName, nameStart, nameEnd, start, end);
        setModifiers(modifiers);
        acceptArguments(formalParameters == null ? EMPTY_PARAMETERS : formalParameters);
        acceptBody(body);
        
        this.isReference = isReference;
        this.phpDoc = phpDoc;
    }
    
    public PHPMethodDeclaration(int start, int end, int nameStart, int nameEnd, String functionName, List<FunctionFormalParameter> formalParameters, Block body, final boolean isReference, PHPDocBlock phpDoc) {
        this(start, end, nameStart, nameEnd, functionName, Modifiers.AccDefault, formalParameters, body, isReference, phpDoc);
    }

    public boolean isReference() {
        return isReference;
    }

    public PHPDocBlock getPhpDoc() {
        return phpDoc;
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

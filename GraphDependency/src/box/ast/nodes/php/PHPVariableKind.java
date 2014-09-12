package box.ast.nodes.php;

import org.eclipse.dltk.ast.references.VariableKind;

public interface PHPVariableKind extends VariableKind{
    public class PHPImplementation extends Implementation implements PHPVariableKind {
        public PHPImplementation(VariableKind kind) {
            super(kind.getId());
        }
    }
    
    /**
     * Variable, like: $name anywhere in function scope
     */
    public static final PHPVariableKind LOCAL = new PHPImplementation(VariableKind.LOCAL);

    /**
     * Variable, like: $name anywhere in global scope
     */
    public static final PHPVariableKind GLOBAL = new PHPImplementation(VariableKind.GLOBAL);

    /**
     * Instance variable, like: $obj->var
     */
    public static final PHPVariableKind INSTANCE = new PHPImplementation(VariableKind.INSTANCE);

    /**
     * Class variable, like: DAO::$instance
     */
    public static final PHPVariableKind CLASS = new PHPImplementation(VariableKind.CLASS);

    /**
     * Constant, like: E_ALL
     */
    public static final PHPVariableKind CONSTANT = new PHPImplementation(VariableKind.GLOBAL);
}

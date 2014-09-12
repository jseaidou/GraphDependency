package box.ast.nodes.php;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;

import box.ast.visitor.ASTPrintVisitor;

public class PHPDocTag extends ASTNode implements PHPDocTagKinds {

    @Override
    public void traverse(ASTVisitor visitor) throws Exception {
        visitor.visit(this);
        visitor.endvisit(this);
    }

    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

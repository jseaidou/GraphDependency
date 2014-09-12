package box.ast.nodes.php;

import org.eclipse.dltk.ast.expressions.CallArgumentsList;

import box.ast.visitor.ASTPrintVisitor;

public class PHPCallArgumentsList extends CallArgumentsList {
    public PHPCallArgumentsList() {
    }

    public PHPCallArgumentsList(int start, int end) {
        super(start, end);
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

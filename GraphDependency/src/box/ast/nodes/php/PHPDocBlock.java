package box.ast.nodes.php;

import org.eclipse.dltk.ast.ASTVisitor;

import box.ast.nodes.ASTNodeKinds;
import box.ast.nodes.Comment;
import box.ast.visitor.ASTPrintVisitor;

public class PHPDocBlock extends Comment {
    private String shortDescription;
    private PHPDocTag[] tags;
    public PHPDocBlock(int start, int end, String shortDescription, PHPDocTag[] tags) {
        super(start, end, CommentEnum.PHPDOC);
        this.shortDescription = shortDescription;
        this.tags = tags;
    }

    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            for(PHPDocTag t : this.tags) {
                t.traverse(visitor);
            }
        }
        visitor.endvisit(this);
    }
    
    public String getShortDescription() {
        return shortDescription;
    }

    public PHPDocTag[] getTags() {
        return tags;
    }

    public int getKind() {
        return ASTNodeKinds.PHP_DOC_BLOCK.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

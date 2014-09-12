package box.ast.nodes;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a single line,multi line comment
 * Represents a PHPDocBlock
 * 1.   // this is a single line comment
 * 2.   # this is a single line comment
 * 3.   /* this is a multi line comment
 * 4.   /** this is a php doc block
 * @author jseaidoun
 *
 */
public class Comment extends ASTNode {
    private final CommentEnum type;
    
    public Comment(int start, int end, CommentEnum type){
        super(start, end);
        this.type = type;
    }
    
    @Override
    public void traverse(ASTVisitor visitor) throws Exception {
        visitor.visit(this);
        visitor.endvisit(this);
    }
    
    public CommentEnum getType() {
        return this.type;
    }
    
    public static String getType(int type) {
        return CommentEnum.getValue(type).toString();
    }
    
    public enum CommentEnum {
        SINGLE_LINE(0),
        MULTI_LINE(1),
        PHPDOC(2);
        
        private int value; 
        private static final Map<Integer, CommentEnum> lookup = new HashMap<Integer, CommentEnum>();
        
        static {
            for(CommentEnum c : CommentEnum.values()) {
                lookup.put(c.getValue(), c);
            }
        }
        
        private CommentEnum(int value) { 
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

        public static CommentEnum getValue(int value) {
            return lookup.get(value);
        }
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }

}

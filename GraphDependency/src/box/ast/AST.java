package box.ast;

import java.util.Set;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class AST extends CommonTree{
    private static int depth = 0;
    public int startIndex;
    public int endIndex;
    public Set<Integer> indexSet;
    
    public AST() {}
    
    public AST(Token token) {
        super(token);
    }
    
    public void setIndexSet(Set<Integer> iSet){
        this.indexSet = iSet;
    }
    
    public void setIndex(int sIndex, int eIndex) {
        this.startIndex = sIndex;
        this.endIndex = eIndex;
    }
    
    @Override
    public String toStringTree() {
        if ( children==null || children.isEmpty() ) {
            return this.toString();
        }
        StringBuilder spaces = new StringBuilder();
        for(int i = 0; i < depth; i++) {
            spaces.append("  ");
        }
        
        StringBuilder buf = new StringBuilder();
        if ( !isNil() ) {
            buf.append("\n" + spaces);
            buf.append("( ");
            buf.append(this.toString());
            buf.append(' ');
        }
        for (int i = 0; children!=null && i < children.size(); i++) {
            Tree t = (Tree)children.get(i);
            if ( i>0 ) {
                buf.append(' ');
            }
            AST.depth++;
            buf.append(t.toStringTree() );
            AST.depth--;
        }
        if ( !isNil() ) {
            buf.append(" )");
        }
        return buf.toString();
    }
}

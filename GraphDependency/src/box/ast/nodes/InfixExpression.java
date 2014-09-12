package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a infix expression:
 * 1.   $a + 1
 * 2.   3 - 2
 * 3.   foo() * $a->bar()
 * 4.   'string'.$c
 * @author jseaidoun
 *
 */
public class InfixExpression extends Expression {
    private final Expression left;
    private final InfixEnum op;
    private final Expression right;
    public InfixExpression(int start, int end, Expression left, InfixEnum operator, Expression right) {
        super(start, end);
        assert ((left != null) && (right != null) );
        this.left = left;
        this.right = right;
        this.op = operator;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            this.left.traverse(visitor);
            this.right.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    public Expression getLeft() {
        return this.left;
    }
    
    public Expression getRight() {
        return this.right;
    }

    public String getOperator() {
        return this.op.toString();
    }
    
    public InfixEnum getOp() {
        return this.op;
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.INFIX_EXPRESSION.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
    
    public enum InfixEnum {
        IS_IDENTICAL, // '==='
        IS_NOT_IDENTICAL, // '!=='
        IS_EQUAL, // '=='
        IS_NOT_EQUAL, // '!='
        LESS_THAN, // '<'
        LESS_EQUAL, // '<=' 
        GREATER_THAN, // '>'
        GREATER_EQUAL, // '>='
        BOOL_OR, // '||'
        BOOL_AND, // '&&'
        STRING_OR, // 'or'
        STRING_AND, // 'and'
        STRING_XOR, // 'xor'
        OR, // '|'
        AND, // '&'
        XOR, // '^'
        CONCAT, // '.'
        PLUS, // '+'
        MINUS, // '-'
        MULT, // '*'
        DIV, // '/'
        MOD, // '%'
        LSHIFT, // '<<'
        RSHIFT; // '>>'
    }
}

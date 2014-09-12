package box.ast.nodes;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a assignment expression:
 * 1.   $a = 5
 * 2.   $a += 5
 * 3.   $a .= $b
 * ..
 * @author jseaidoun
 *
 */
public class AssignmentExpression extends Expression {
    private Expression lhSide;
    private Expression rhSide;
    private AssignmentEnum operator;
    
    public AssignmentExpression(int start, int end, Expression leftHandSide, AssignmentEnum operator, Expression rightHandSide) {
        super(start, end);
        assert ( (leftHandSide != null) && (rightHandSide != null) );
        this.lhSide = leftHandSide;
        this.rhSide = rightHandSide;
        this.operator = operator;
    }
    
    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            this.lhSide.traverse(visitor);
            this.rhSide.traverse(visitor);
        }
        visitor.endvisit(this);
    }
    
    @Override
    public int getKind() {
        return ASTNodeKinds.ASSIGNMENT.ordinal();
    }
    
    @Override
    public String getOperator() {
        return this.operator.toString();
    }
    
    public AssignmentEnum getOperatorType() {
        return this.operator;
    }
    
    public Expression getLeftHandSide() {
        return this.lhSide;
    }
    
    public Expression getRightHandSide() {
        return this.rhSide;
    }
    public enum AssignmentEnum {
        EQUAL, // '='
        PLUS_EQUAL, //'+='
        MINUS_EQUAL, // '-='
        MULT_EQUAL, // '*='
        DIV_EQUAL, // '/='
        CONCAT_EQUAL, // '.='
        MOD_EQUAL, // '%='
        AND_EQUAL, // '&='
        OR_EQUAL, // '|='
        XOR_EQUAL, // '^='
        LSHIFT_EQUAL, // '<<='
        RSHIFT_EQUAL, // '>>='
        REF_EQUAL; // =&
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }

}

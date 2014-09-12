package box.ast.nodes;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Block;

import box.ast.visitor.ASTPrintVisitor;

/**
 * Represents a lambda function declaration:
 * 1.   function & (parameters) use (lexical variables) {body}
 * @author jseaidoun
 *
 */
public class LambdaFunctionDeclaration extends Expression {
    private final boolean isReference;
    private final List<? extends Expression> lexicalVars;
    protected List<FunctionFormalParameter> arguments = new LinkedList<FunctionFormalParameter>();
    private Block body = new Block();
    
    public LambdaFunctionDeclaration(int start, int end, List<FunctionFormalParameter> formalParameters, List<? extends Expression> lexicalVars, Block body, final boolean isReference) {
        super(start, end);
        if(formalParameters != null) {
            this.arguments = formalParameters;
        }
        this.body = body;
        this.lexicalVars = lexicalVars;
        this.isReference = isReference;
    }

    public void traverse(ASTVisitor visitor) throws Exception {
        final boolean visit = visitor.visit(this);
        if(visit) {
            for(FunctionFormalParameter f : this.arguments ) {
                f.traverse(visitor);
            }
            if(this.lexicalVars != null) {
                for(Expression e : this.lexicalVars ) {
                    e.traverse(visitor);
                }
            }
            if(this.body != null) {
                this.body.traverse(visitor);
            }
        }
        visitor.endvisit(this);
    }
    
    public boolean isReference() {
        return isReference;
    }

    public List<? extends Expression> getLexicalVars() {
        return lexicalVars;
    }

    public List<FunctionFormalParameter> getArguments() {
        return arguments;
    }

    public Block getBody() {
        return body;
    }
    
    public int getKind() {
        return ASTNodeKinds.LAMBDA_FUNCTION.ordinal();
    }
    
    @Override
    public String toString() {
        return ASTPrintVisitor.toXMLString(this);
    }
}

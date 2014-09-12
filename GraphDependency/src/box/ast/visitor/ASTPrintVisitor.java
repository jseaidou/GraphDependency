package box.ast.visitor;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.declarations.Declaration;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.references.ConstantReference;
import org.eclipse.dltk.ast.references.SimpleReference;
import org.eclipse.dltk.ast.references.TypeReference;
import org.eclipse.dltk.ast.references.VariableReference;
import org.eclipse.dltk.ast.statements.Statement;

import box.ast.nodes.ASTError;
import box.ast.nodes.ArrayCreation;
import box.ast.nodes.ArrayElement;
import box.ast.nodes.ArrayVariableReference;
import box.ast.nodes.AssignmentExpression;
import box.ast.nodes.BackTickExpression;
import box.ast.nodes.BreakStatement;
import box.ast.nodes.CastExpression;
import box.ast.nodes.CatchStatement;
import box.ast.nodes.ClassDeclaration;
import box.ast.nodes.ClassInstanceCreation;
import box.ast.nodes.CloneExpression;
import box.ast.nodes.Comment;
import box.ast.nodes.ComplexQuote;
import box.ast.nodes.ConditionalExpression;
import box.ast.nodes.ConstStaticAccess;
import box.ast.nodes.ConstantDeclaration;
import box.ast.nodes.ContinueStatement;
import box.ast.nodes.DeclareStatement;
import box.ast.nodes.Dispatch;
import box.ast.nodes.DoWhileStatement;
import box.ast.nodes.EchoStatement;
import box.ast.nodes.EmptyStatement;
import box.ast.nodes.ExpressionStatement;
import box.ast.nodes.FieldAccess;
import box.ast.nodes.ForEachStatement;
import box.ast.nodes.ForStatement;
import box.ast.nodes.FullyQualifiedReference;
import box.ast.nodes.FunctionFormalParameter;
import box.ast.nodes.FunctionFormalParameterByReference;
import box.ast.nodes.GlobalStatement;
import box.ast.nodes.GotoLabel;
import box.ast.nodes.GotoStatement;
import box.ast.nodes.IfStatement;
import box.ast.nodes.IgnoreError;
import box.ast.nodes.Include;
import box.ast.nodes.InfixExpression;
import box.ast.nodes.InstanceOfExpression;
import box.ast.nodes.InterfaceDeclaration;
import box.ast.nodes.LambdaFunctionDeclaration;
import box.ast.nodes.ListVariable;
import box.ast.nodes.NamespaceDeclaration;
import box.ast.nodes.NamespaceReference;
import box.ast.nodes.PostfixExpression;
import box.ast.nodes.PrefixExpression;
import box.ast.nodes.ReferenceExpression;
import box.ast.nodes.ReflectionArrayVariableReference;
import box.ast.nodes.ReflectionCallExpression;
import box.ast.nodes.ReflectionStaticMethodInvocation;
import box.ast.nodes.ReflectionVariableReference;
import box.ast.nodes.ReturnStatement;
import box.ast.nodes.Scalar;
import box.ast.nodes.StaticDispatch;
import box.ast.nodes.StaticFieldAccess;
import box.ast.nodes.StaticMethodInvocation;
import box.ast.nodes.StaticStatement;
import box.ast.nodes.SwitchCase;
import box.ast.nodes.SwitchStatement;
import box.ast.nodes.ThrowStatement;
import box.ast.nodes.TryStatement;
import box.ast.nodes.UnaryOperation;
import box.ast.nodes.UsePart;
import box.ast.nodes.UseStatement;
import box.ast.nodes.WhileStatement;
import box.ast.nodes.php.PHPCallArgumentsList;
import box.ast.nodes.php.PHPCallExpression;
import box.ast.nodes.php.PHPDocBlock;
import box.ast.nodes.php.PHPDocTag;
import box.ast.nodes.php.PHPFieldDeclaration;
import box.ast.nodes.php.PHPMethodDeclaration;
import box.ast.nodes.php.PHPModuleDeclaration;
import box.ast.nodes.php.TraitDeclaration;
import box.util.XMLWriter;

/**
 * Prints AST Nodes
 * 
 * @author jseaidoun
 * 
 */
public class ASTPrintVisitor extends PHPASTVisitor {
    private XMLWriter writer;

    /**
     * Constructs new ASTPrintVisitor
     * 
     * @param out
     * @throws Exception
     */
    private ASTPrintVisitor(OutputStream out) throws Exception {
        writer = new XMLWriter(out, false);
    }

    private void close() {
        writer.flush();
        writer.close();
    }

    public static void toString(ASTNode node) {
        try {
            // ByteArrayOutputStream out = new ByteArrayOutputStream();
            ASTPrintVisitor printVisitor = new ASTPrintVisitor(System.out);
            node.traverse(printVisitor);
            printVisitor.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }

    public static String toXMLString(ASTNode node) {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ASTPrintVisitor printVisitor = new ASTPrintVisitor(out);
            node.traverse(printVisitor);
            printVisitor.close();
            return out.toString("UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return e.toString();
        }
    }

    protected Map<String, String> createInitialParameters(ASTNode node)
            throws Exception {
        Map<String, String> parameters = new HashMap<String, String>();

        parameters.put("start", Integer.toString(node.sourceStart()));
        parameters.put("end", Integer.toString(node.sourceEnd()));

        if (node instanceof Declaration) {
            Declaration declaration = (Declaration) node;
            StringBuilder builder = new StringBuilder();
            if (declaration.isAbstract()) {
                builder.append(",abstract");
            }
            if (declaration.isFinal()) {
                builder.append(",final");
            }
            if (declaration.isPrivate()) {
                builder.append(",private");
            }
            if (declaration.isProtected()) {
                builder.append(",protected");
            }
            if (declaration.isPublic()) {
                builder.append(",public");
            }
            if (declaration.isStatic()) {
                builder.append(",static");
            }
            String modifiers = builder.toString();
            parameters
                    .put("modifiers",
                            modifiers.length() > 0 ? modifiers.substring(1)
                                    : modifiers);
        }
        return parameters;
    }

    public boolean endvisit(ArrayCreation s) throws Exception {
        writer.endTag("ArrayCreation");
        return true;
    }

    public boolean endvisit(ArrayElement s) throws Exception {
        writer.endTag("ArrayElement");
        return true;
    }

    public boolean endvisit(ArrayVariableReference s) throws Exception {
        writer.endTag("ArrayVariableReference");
        return true;
    }

    public boolean endvisit(AssignmentExpression s) throws Exception {
        writer.endTag("AssignmentExpression");
        return true;
    }

    public boolean endvisit(ASTError s) throws Exception {
        writer.endTag("ASTError");
        return true;
    }

    public boolean endvisit(BackTickExpression s) throws Exception {
        writer.endTag("BackTickExpression");
        return true;
    }

    public boolean endvisit(BreakStatement s) throws Exception {
        writer.endTag("BreakStatement");
        return true;
    }

    public boolean endvisit(CastExpression s) throws Exception {
        writer.endTag("CastExpression");
        return true;
    }

    public boolean endvisit(CatchStatement s) throws Exception {
        writer.endTag("CatchStatement");
        return true;
    }

    public boolean endvisit(ConstantDeclaration s) throws Exception {
        writer.endTag("ConstantDeclaration");
        return true;
    }

    public boolean endvisit(ClassDeclaration s) throws Exception {
        writer.endTag("ClassDeclaration");
        return true;
    }

    public boolean endvisit(TraitDeclaration t) throws Exception {
        writer.endTag("TraitDeclaration");
        return true;
    }

    public boolean endvisit(ClassInstanceCreation s) throws Exception {
        writer.endTag("ClassInstanceCreation");
        return true;
    }

    public boolean endvisit(CloneExpression s) throws Exception {
        writer.endTag("CloneExpression");
        return true;
    }

    public boolean endvisit(Comment s) throws Exception {
        writer.endTag("Comment");
        return true;
    }

    public boolean endvisit(ConditionalExpression s) throws Exception {
        writer.endTag("ConditionalExpression");
        return true;
    }

    public boolean endvisit(ConstantReference s) throws Exception {
        writer.endTag("ConstantReference");
        return true;
    }

    public boolean endvisit(ContinueStatement s) throws Exception {
        writer.endTag("ContinueStatement");
        return true;
    }

    public boolean endvisit(DeclareStatement s) throws Exception {
        writer.endTag("DeclareStatement");
        return true;
    }

    public boolean endvisit(Dispatch s) throws Exception {
        writer.endTag("Dispatch");
        return true;
    }

    public boolean endvisit(DoWhileStatement s) throws Exception {
        writer.endTag("DoWhileStatement");
        return true;
    }

    public boolean endvisit(EchoStatement s) throws Exception {
        writer.endTag("EchoStatement");
        return true;
    }

    public boolean endvisit(EmptyStatement s) throws Exception {
        writer.endTag("EmptyStatement");
        return true;
    }

    public boolean endvisit(ExpressionStatement s) throws Exception {
        writer.endTag("ExpressionStatement");
        return true;
    }

    public boolean endvisit(FieldAccess s) throws Exception {
        writer.endTag("FieldAccess");
        return true;
    }

    public boolean endvisit(ForEachStatement s) throws Exception {
        writer.endTag("ForEachStatement");
        return true;
    }

    public boolean endvisit(FunctionFormalParameter s) throws Exception {
        writer.endTag("FunctionFormalParameter");
        return true;
    }

    public boolean endvisit(FunctionFormalParameterByReference s)
            throws Exception {
        writer.endTag("FunctionFormalParameterByReference");
        return true;
    }

    public boolean endvisit(ForStatement s) throws Exception {
        writer.endTag("ForStatement");
        return true;
    }

    public boolean endvisit(GlobalStatement s) throws Exception {
        writer.endTag("GlobalStatement");
        return true;
    }

    public boolean endvisit(IfStatement s) throws Exception {
        writer.endTag("IfStatement");
        return true;
    }

    public boolean endvisit(IgnoreError s) throws Exception {
        writer.endTag("IgnoreError");
        return true;
    }

    public boolean endvisit(Include s) throws Exception {
        writer.endTag("Include");
        return true;
    }

    public boolean endvisit(InfixExpression s) throws Exception {
        writer.endTag("InfixExpression");
        return true;
    }

    public boolean endvisit(InstanceOfExpression s) throws Exception {
        writer.endTag("InstanceOfExpression");
        return true;
    }

    public boolean endvisit(InterfaceDeclaration s) throws Exception {
        writer.endTag("InterfaceDeclaration");
        return true;
    }

    public boolean endvisit(ListVariable s) throws Exception {
        writer.endTag("ListVariable");
        return true;
    }

    public boolean endvisit(PHPCallArgumentsList s) throws Exception {
        writer.endTag("PHPCallArgumentsList");
        return true;
    }

    public boolean endvisit(PHPCallExpression s) throws Exception {
        writer.endTag("PHPCallExpression");
        return true;
    }

    public boolean endvisit(PHPDocBlock s) throws Exception {
        writer.endTag("PHPDocBlock");
        return true;
    }

    public boolean endvisit(PHPDocTag s) throws Exception {
        writer.endTag("PHPDocTag");
        return true;
    }

    public boolean endvisit(PHPFieldDeclaration s) throws Exception {
        writer.endTag("PHPFieldDeclaration");
        return true;
    }

    public boolean endvisit(PHPMethodDeclaration s) throws Exception {
        writer.endTag("PHPMethodDeclaration");
        return true;
    }

    public boolean endvisit(PostfixExpression s) throws Exception {
        writer.endTag("PostfixExpression");
        return true;
    }

    public boolean endvisit(PrefixExpression s) throws Exception {
        writer.endTag("PrefixExpression");
        return true;
    }

    public boolean endvisit(ComplexQuote s) throws Exception {
        writer.endTag("ComplexQuote");
        return true;
    }

    public boolean endvisit(ReferenceExpression s) throws Exception {
        writer.endTag("ReferenceExpression");
        return true;
    }

    public boolean endvisit(ReflectionArrayVariableReference s)
            throws Exception {
        writer.endTag("ReflectionArrayVariableReference");
        return true;
    }

    public boolean endvisit(ReflectionCallExpression s) throws Exception {
        writer.endTag("ReflectionCallExpression");
        return true;
    }

    public boolean endvisit(ReflectionStaticMethodInvocation s)
            throws Exception {
        writer.endTag("ReflectionStaticMethodInvocation");
        return true;
    }

    public boolean endvisit(ReflectionVariableReference s) throws Exception {
        writer.endTag("ReflectionVariableReference");
        return true;
    }

    public boolean endvisit(ReturnStatement s) throws Exception {
        writer.endTag("ReturnStatement");
        return true;
    }

    public boolean endvisit(Scalar s) throws Exception {
        writer.endTag("Scalar");
        return true;
    }

    public boolean endvisit(SimpleReference s) throws Exception {
        writer.endTag("SimpleReference");
        return true;
    }

    public boolean endvisit(ConstStaticAccess s) throws Exception {
        writer.endTag("ConstStaticAccess");
        return true;
    }

    public boolean endvisit(StaticDispatch s) throws Exception {
        writer.endTag("StaticDispatch");
        return true;
    }

    public boolean endvisit(StaticFieldAccess s) throws Exception {
        writer.endTag("StaticFieldAccess");
        return true;
    }

    public boolean endvisit(StaticMethodInvocation s) throws Exception {
        writer.endTag("StaticMethodInvocation");
        return true;
    }

    public boolean endvisit(StaticStatement s) throws Exception {
        writer.endTag("StaticStatement");
        return true;
    }

    public boolean endvisit(SwitchCase s) throws Exception {
        writer.endTag("SwitchCase");
        return true;
    }

    public boolean endvisit(SwitchStatement s) throws Exception {
        writer.endTag("SwitchStatement");
        return true;
    }

    public boolean endvisit(ThrowStatement s) throws Exception {
        writer.endTag("ThrowStatement");
        return true;
    }

    public boolean endvisit(TryStatement s) throws Exception {
        writer.endTag("TryStatement");
        return true;
    }

    public boolean endvisit(TypeReference s) throws Exception {
        writer.endTag("TypeReference");
        return true;
    }

    public boolean endvisit(FullyQualifiedReference s) throws Exception {
        writer.endTag("FullyQualifiedReference");
        return true;
    }

    public boolean endvisit(NamespaceReference s) throws Exception {
        writer.endTag("NamespaceReference");
        return true;
    }

    public boolean endvisit(UnaryOperation s) throws Exception {
        writer.endTag("UnaryOperation");
        return true;
    }

    public boolean endvisit(VariableReference s) throws Exception {
        writer.endTag("VariableReference");
        return true;
    }

    public boolean endvisit(WhileStatement s) throws Exception {
        writer.endTag("WhileStatement");
        return true;
    }

    public boolean endvisit(ModuleDeclaration s) throws Exception {
        List<ASTError> errors = ((PHPModuleDeclaration) s).getErrors();
        if (!errors.isEmpty()) {
            writer.startTag("Errors", null);
            for (ASTError error : errors) {
                error.traverse(this);
            }
            writer.endTag("Errors");
        }
        writer.endTag("ModuleDeclaration");
        return true;
    }

    public boolean endvisit(NamespaceDeclaration s) throws Exception {
        writer.endTag("NamespaceDeclaration");
        return true;
    }

    public boolean endvisit(UseStatement s) throws Exception {
        writer.endTag("UseStatement");
        return true;
    }

    public boolean endvisit(GotoLabel s) throws Exception {
        writer.endTag("GotoLabel");
        return true;
    }

    public boolean endvisit(GotoStatement s) throws Exception {
        writer.endTag("GotoStatement");
        return true;
    }

    public boolean endvisit(LambdaFunctionDeclaration s) throws Exception {
        writer.endTag("LambdaFunctionDeclaration");
        return true;
    }

    public boolean visit(ArrayCreation s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("ArrayCreation", parameters);
        return true;
    }

    public boolean visit(ArrayElement s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("ArrayElement", parameters);
        return true;
    }

    public boolean visit(ArrayVariableReference s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("type",
                ArrayVariableReference.getType(s.getType().ordinal()));
        parameters.put("name", s.getName());
        writer.startTag("ArrayVariableReference", parameters);
        return true;
    }

    public boolean visit(AssignmentExpression s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("operator", s.getOperator());
        writer.startTag("AssignmentExpression", parameters);
        return true;
    }

    public boolean visit(ASTError s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("ASTError", parameters);
        return true;
    }

    public boolean visit(BackTickExpression s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("BackTickExpression", parameters);
        return true;
    }

    public boolean visit(BreakStatement s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("BreakStatement", parameters);
        return true;
    }

    public boolean visit(CastExpression s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("type", CastExpression.getType(s.getType().ordinal()));
        writer.startTag("CastExpression", parameters);
        return true;
    }

    public boolean visit(CatchStatement s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("CatchStatement", parameters);
        return true;
    }

    public boolean visit(ConstantDeclaration s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("ConstantDeclaration", parameters);
        return true;
    }

    public boolean visit(ClassDeclaration s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("name", s.getName());
        writer.startTag("ClassDeclaration", parameters);
        return true;
    }

    public boolean visit(TraitDeclaration t) throws Exception {
        Map<String, String> parameters = createInitialParameters(t);
        parameters.put("name", t.getName());
        writer.startTag("TraitDeclaration", parameters);
        return true;
    }

    public boolean visit(ClassInstanceCreation s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("ClassInstanceCreation", parameters);
        return true;
    }

    public boolean visit(CloneExpression s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("CloneExpression", parameters);
        return true;
    }

    public boolean visit(Comment s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("type", Comment.getType(s.getType().ordinal()));
        writer.startTag("Comment", parameters);
        return true;
    }

    public boolean visit(ConditionalExpression s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("ConditionalExpression", parameters);

        writer.startTag("Condition", new HashMap<String, String>());
        s.getCondition().traverse(this);
        writer.endTag("Condition");

        Expression ifTrue = s.getIfTrue();
        if (ifTrue != null) {
            writer.startTag("IfTrue", new HashMap<String, String>());
            ifTrue.traverse(this);
            writer.endTag("IfTrue");
        }

        Expression falseExp = s.getIfFalse();
        if (falseExp != null) {
            writer.startTag("IfFalse", new HashMap<String, String>());
            falseExp.traverse(this);
            writer.endTag("IfFalse");
        }

        return false;
    }

    public boolean visit(ConstantReference s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("name", s.getName());
        writer.startTag("ConstantReference", parameters);
        return true;
    }

    public boolean visit(ContinueStatement s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("ContinueStatement", parameters);
        return true;
    }

    public boolean visit(DeclareStatement s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("DeclareStatement", parameters);
        return true;
    }

    public boolean visit(Dispatch s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("Dispatch", parameters);
        return true;
    }

    public boolean visit(DoWhileStatement s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("DoWhileStatement", parameters);
        return true;
    }

    public boolean visit(EchoStatement s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("EchoStatement", parameters);
        return true;
    }

    public boolean visit(EmptyStatement s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("EmptyStatement", parameters);
        return true;
    }

    public boolean visit(ExpressionStatement s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("ExpressionStatement", parameters);
        return true;
    }

    public boolean visit(FieldAccess s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("FieldAccess", parameters);
        return true;
    }

    public boolean visit(ForEachStatement s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("ForEachStatement", parameters);
        return true;
    }

    public boolean visit(FunctionFormalParameter s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("isMandatory", Boolean.toString(s.getIsMandatory()));
        writer.startTag("FunctionFormalParameter", parameters);
        return true;
    }

    public boolean visit(FunctionFormalParameterByReference s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("FunctionFormalParameterByReference", parameters);
        return true;
    }

    public boolean visit(ForStatement s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("ForStatement", parameters);

        writer.startTag("Initializations", new HashMap<String, String>());
        for (Expression initialization : s.getInitializations()) {
            initialization.traverse(this);
        }
        writer.endTag("Initializations");

        writer.startTag("Conditions", new HashMap<String, String>());
        for (Expression condition : s.getConditions()) {
            condition.traverse(this);
        }
        writer.endTag("Conditions");

        writer.startTag("Increasements", new HashMap<String, String>());
        for (Expression increasement : s.getIncreasements()) {
            increasement.traverse(this);
        }
        writer.endTag("Increasements");

        s.getAction().traverse(this);

        return false;
    }

    public boolean visit(GlobalStatement s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("GlobalStatement", parameters);
        return true;
    }

    public boolean visit(IfStatement s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("IfStatement", parameters);

        writer.startTag("Condition", new HashMap<String, String>());
        s.getCondition().traverse(this);
        writer.endTag("Condition");

        writer.startTag("TrueStatement", new HashMap<String, String>());
        s.getTrueStatement().traverse(this);
        writer.endTag("TrueStatement");

        Statement falseStatement = s.getFalseStatement();
        if (falseStatement != null) {
            writer.startTag("FalseStatement", new HashMap<String, String>());
            falseStatement.traverse(this);
            writer.endTag("FalseStatement");
        }

        return false;
    }

    public boolean visit(IgnoreError s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("IgnoreError", parameters);
        return true;
    }

    public boolean visit(Include s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("type", s.getType().toString());
        writer.startTag("Include", parameters);
        return true;
    }

    public boolean visit(InfixExpression s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("operator", s.getOperator());
        writer.startTag("InfixExpression", parameters);
        return true;
    }

    public boolean visit(InstanceOfExpression s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("InstanceOfExpression", parameters);
        return true;
    }

    public boolean visit(InterfaceDeclaration s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("name", s.getName());
        writer.startTag("InterfaceDeclaration", parameters);
        return true;
    }

    public boolean visit(ListVariable s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("ListVariable", parameters);
        return true;
    }

    public boolean visit(PHPCallArgumentsList s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("PHPCallArgumentsList", parameters);
        return true;
    }

    public boolean visit(PHPCallExpression s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("PHPCallExpression", parameters);
        return true;
    }

    public boolean visit(PHPDocBlock s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("shortDescription", s.getShortDescription());
        writer.startTag("PHPDocBlock", parameters);
        return true;
    }

    public boolean visit(PHPDocTag s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("PHPDocTag", parameters);
        return true;
    }

    public boolean visit(PHPFieldDeclaration s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("PHPFieldDeclaration", parameters);
        return true;
    }

    public boolean visit(PHPMethodDeclaration s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("name", s.getName());
        writer.startTag("PHPMethodDeclaration", parameters);
        return true;
    }

    public boolean visit(PostfixExpression s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("operator", s.getOperator());
        writer.startTag("PostfixExpression", parameters);
        return true;
    }

    public boolean visit(PrefixExpression s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("operator", s.getOperator());
        writer.startTag("PrefixExpression", parameters);
        return true;
    }

    public boolean visit(ComplexQuote s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("type", ComplexQuote.getType(s.getType()));
        writer.startTag("ComplexQuote", parameters);
        return true;
    }

    public boolean visit(ReferenceExpression s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("ReferenceExpression", parameters);
        return true;
    }

    public boolean visit(ReflectionArrayVariableReference s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("ReflectionArrayVariableReference", parameters);
        return true;
    }

    public boolean visit(ReflectionCallExpression s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("ReflectionCallExpression", parameters);
        return true;
    }

    public boolean visit(ReflectionStaticMethodInvocation s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("ReflectionStaticMethodInvocation", parameters);
        return true;
    }

    public boolean visit(ReflectionVariableReference s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("ReflectionVariableReference", parameters);
        return true;
    }

    public boolean visit(ReturnStatement s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("ReturnStatement", parameters);
        return true;
    }

    public boolean visit(Scalar s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("type", s.getType().toString());
        parameters.put("value", s.getValue());
        writer.startTag("Scalar", parameters);
        return true;
    }

    public boolean visit(SimpleReference s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("name", s.getName());
        writer.startTag("SimpleReference", parameters);
        return true;
    }

    public boolean visit(ConstStaticAccess s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("ConstStaticAccess", parameters);
        return true;
    }

    public boolean visit(StaticDispatch s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("StaticDispatch", parameters);
        return true;
    }

    public boolean visit(StaticFieldAccess s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("StaticFieldAccess", parameters);
        return true;
    }

    public boolean visit(StaticMethodInvocation s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("StaticMethodInvocation", parameters);
        return true;
    }

    public boolean visit(StaticStatement s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("StaticStatement", parameters);
        return true;
    }

    public boolean visit(SwitchCase s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("SwitchCase", parameters);
        return true;
    }

    public boolean visit(SwitchStatement s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("SwitchStatement", parameters);
        return true;
    }

    public boolean visit(ThrowStatement s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("ThrowStatement", parameters);
        return true;
    }

    public boolean visit(TryStatement s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("TryStatement", parameters);
        return true;
    }

    public boolean visit(TypeReference s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("name", s.getName());
        writer.startTag("TypeReference", parameters);
        return true;
    }

    public boolean visit(FullyQualifiedReference s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("name", s.getFullyQualifiedName());
        writer.startTag("FullyQualifiedReference", parameters);
        return true;
    }

    public boolean visit(NamespaceReference s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("name", s.getName());
        parameters.put("global", Boolean.toString(s.isGlobal()));
        parameters.put("local", Boolean.toString(s.isGlobal()));
        writer.startTag("NamespaceReference", parameters);
        return true;
    }

    public boolean visit(UnaryOperation s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("operator", s.getOperator());
        writer.startTag("UnaryOperation", parameters);
        return true;
    }

    public boolean visit(VariableReference s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("name", s.getName());
        writer.startTag("VariableReference", parameters);
        return true;
    }

    public boolean visit(WhileStatement s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("WhileStatement", parameters);
        return true;
    }

    public boolean visit(ModuleDeclaration s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("ModuleDeclaration", parameters);
        return true;
    }

    public boolean visit(NamespaceDeclaration s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("name", s.getName());
        writer.startTag("NamespaceDeclaration", parameters);
        return true;
    }

    public boolean visit(UseStatement s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("UseStatement", parameters);

        writer.startTag("Parts", new HashMap<String, String>());
        for (UsePart p : s.getParts()) {
            p.traverse(this);
        }
        writer.endTag("Parts");
        return true;
    }

    public boolean visit(UsePart s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        writer.startTag("UsePart", parameters);
        s.getNamespace().traverse(this);
        if (s.getAlias() != null) {
            s.getAlias().traverse(this);
        }
        writer.endTag("UsePart");
        return true;
    }

    public boolean visit(GotoLabel s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("label", s.getLabel());
        writer.startTag("GotoLabel", parameters);
        return true;
    }

    public boolean visit(GotoStatement s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("label", s.getLabel());
        writer.startTag("GotoStatement", parameters);
        return true;
    }

    public boolean visit(LambdaFunctionDeclaration s) throws Exception {
        Map<String, String> parameters = createInitialParameters(s);
        parameters.put("isReference", Boolean.toString(s.isReference()));
        writer.startTag("LambdaFunctionDeclaration", parameters);

        writer.startTag("Arguments", new HashMap<String, String>());
        for (FunctionFormalParameter p : s.getArguments()) {
            p.traverse(this);
        }
        writer.endTag("Arguments");

        Collection<? extends Expression> lexicalVars = s.getLexicalVars();
        if (lexicalVars != null) {
            writer.startTag("LexicalVars", new HashMap<String, String>());
            for (Expression var : lexicalVars) {
                var.traverse(this);
            }
            writer.endTag("LexicalVars");
        }

        s.getBody().traverse(this);

        return false;
    }
}

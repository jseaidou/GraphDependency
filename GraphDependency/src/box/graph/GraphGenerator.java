package box.graph;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Paint;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;

import org.antlr.runtime.tree.Tree;
import org.apache.commons.collections15.Transformer;
import org.jgrapht.graph.DefaultEdge;

import box.ast.AST;
import box.php.PHPASTParser;
import edu.uci.ics.jung.algorithms.layout.DAGLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.DirectedOrderedSparseMultigraph;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;

public class GraphGenerator {
    private AST tree;
    
    private final Graph<Node, DefaultEdge> graph = new DirectedOrderedSparseMultigraph<Node, DefaultEdge>();
    private final AdjacencyList<Node> adjList = new AdjacencyList<Node>();
    private Node classNode;
    
    public GraphGenerator() {
    }
    
    public GraphGenerator(AST tree) {
        this();
        this.tree = tree;
    }
    
    public void generateGraph() {
        Node root = findClassDecl(tree);
        addDependencies(tree, root);
        for(Map.Entry<Node,List<Node> > entry : this.adjList.getAdjacencyList().entrySet()){
            Node r = entry.getKey();
            List<Node> edges = entry.getValue();
            System.out.println(r.toString() );
            for(Node node : edges) {
                System.out.print(node.toString() + " " );
            }
            System.out.println("");
        }
    }
    
    public void setTree(AST tree) {
        this.tree = tree;
    }
    
    public void generateGraphPanel() {
        int vCount = graph.getVertexCount();
        Layout<Node, DefaultEdge> layout = new DAGLayout<Node, DefaultEdge>(graph);
        layout.setSize(new Dimension(50*vCount, 50*vCount) );
        BasicVisualizationServer<Node, DefaultEdge> vServer = new BasicVisualizationServer<Node, DefaultEdge>(layout);
        vServer.setPreferredSize(new Dimension(50*vCount,50*vCount) );
        Transformer<Node,Paint> vertexPaint = new Transformer<Node,Paint>() {
            public Paint transform(Node node) {
                return node.getColor();
            }
        };
        vServer.getRenderContext().setVertexFillPaintTransformer(vertexPaint);
        vServer.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<Node>());
        JFrame frame = new JFrame("GraphDependency");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = frame.getContentPane();
        con.add(vServer);
        frame.setVisible(true);
        frame.pack();
    }
    
    private Node findClassDecl(AST tree) {
        AST node = null; 
        if(tree.getType() == PHPASTParser.CLASS_T) {
            node = tree;
        }
        else{
            node =(AST)tree.getFirstChildWithType(PHPASTParser.CLASS_T);
        }
        if(node == null) {
            return null;
        }
        node = (AST)node.getFirstChildWithType(PHPASTParser.IDENTIFIER);
        if(node != null) {
            this.classNode = new Node(node.getText(), Color.green);
            this.graph.addVertex(this.classNode);
        }

        return this.classNode;
    }

    private Tree findClassNameToken(AST tree) {
        if(tree.getType() == PHPASTParser.CALL) {
            return tree.getFirstChildWithType(PHPASTParser.IDENTIFIER);
        }
        Tree callNode = tree.getFirstChildWithType(PHPASTParser.CALL);
        if(callNode != null){
            return ((AST)callNode).getFirstChildWithType(PHPASTParser.IDENTIFIER);
        }
        return null;
    }
    
    private Tree findDieselNameToken(AST tree) {
        AST t = null;
        t = (AST)tree.getFirstChildWithType(PHPASTParser.DOMAIN_T);
        if(t != null){
            AST dieselToken = (AST)t.getFirstChildWithType(PHPASTParser.IDENTIFIER);
            if( (dieselToken != null) && dieselToken.getText().equals("Diesel") ) {
                return getXthChildWithType(2, PHPASTParser.IDENTIFIER, t);
            }
        }
        return null;
    }
    
    private Tree getXthChildWithType(int xTh, int type, AST tree) {
        List<? extends Object> children = tree.getChildren();
        int seen = 0;
        for (int i = 0; (children != null) && (i < children.size() ); i++) {
            Tree t = (Tree) children.get(i);
            if ( t.getType()==type ) {
                seen++;
            }
            if( seen == xTh) {
                return t;
            }
        }
        return null;
    }
    
    /**
     * Generate graph from AST.
     * We look for class declarations and add to class instance all referenced objects
     * @param tree
     * @param graph
     * @param root
     */
    private void addDependencies(AST tree, Node root) {
        Tree classNode = null;
        List<? extends Object> children = tree.getChildren();

        if ( (children == null) || children.isEmpty() ) {
            return;
        }

        for(Object o : children) {
            Tree t = (Tree)o;
            if ( t.getType() == PHPASTParser.NEW_T ) {
                classNode = findClassNameToken((AST)t);
            }
            else if (t.getType() == PHPASTParser.CALL ){
                classNode = findDieselNameToken((AST) t);
            }
            if(classNode != null) {
                Node node = new Node( ((AST)classNode).getText(), Color.red);
                this.graph.addVertex(node);
                this.graph.addEdge(new DefaultEdge(), root, node);
                this.adjList.addAdjacency(root, node);
            }
            addDependencies((AST) t, root);
        }
        return;
    }
}

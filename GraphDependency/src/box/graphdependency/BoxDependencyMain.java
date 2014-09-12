package box.graphdependency;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import box.ast.AST;
import box.ast.visitor.ASTPrintVisitor;
import box.graph.GraphGenerator;
import box.php.PHPSourceParser;

/**
 * This is a Graph generator showing object dependencies in a project
 * @author jseaidoun
 */
public class BoxDependencyMain {
    
    /**
     * 
     * @param args - The first argument is the root directory for the project to 
     *                  generate dependency graph for
     */
    public static void main(String[] args) {
        String rootDir = args[0];
        PHPSourceParser source = new PHPSourceParser();
        List<File> fileList = generateFileList(rootDir);
        System.out.println("Starting parser" );
        GraphGenerator generator = new GraphGenerator();
        for(File file : fileList) {
            try {
                System.out.println("filename: " + file.getAbsolutePath());
                source.parse(new FileReader(file), null);
                AST tree = source.getTree();
                System.out.println(tree.toStringTree());
                generator.setTree(tree);
                generator.generateGraph();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        generator.generateGraphPanel();
    }
    
    private static List<File> generateFileList(String root) {
        File rootDir = new File(root);
        List<File> retFileList = new ArrayList<File>();
        File fileList[] = rootDir.listFiles();
        if(fileList == null) {
            fileList = new File[1];
            fileList[0] = rootDir;
        }
        
        for(File f : fileList) {
            if(f.isDirectory() ){
                retFileList.addAll(generateFileList(f.getAbsolutePath() ) );
            }
            if(!f.getName().endsWith("php") ){
                continue;
            }
            retFileList.add(f);
        }
        return retFileList;
    }
}

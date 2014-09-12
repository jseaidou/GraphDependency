package box.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdjacencyList <T> {
    private final Map<T, List<T>> adjacencyList = new HashMap<T, List<T> >(10);

    public void addAdjacency(T vertex1, T vertex2) {
        if(this.adjacencyList.containsKey(vertex1) ){
            this.adjacencyList.get(vertex1).add(vertex2);
        }
        else {
            List<T> list = new ArrayList<T>();
            list.add(vertex2);
            this.adjacencyList.put(vertex1, list);
        }
    }
    
    public Map<T, List<T> > getAdjacencyList() {
        return this.adjacencyList;
    }
}

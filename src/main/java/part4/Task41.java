package part4;

import java.util.*;

/**
 * several hours
 */
public class Task41 {

}

class Graph {
    private HashMap<String, List<String>> vertexMap = new HashMap<>();

    public boolean isPathExist(String vertexStart, String vertexEnd) {
        if (!isVertexInMap(vertexStart) | !isVertexInMap(vertexEnd)) {
            return false;
        }

        LinkedList<String> nextToVisit = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();
        nextToVisit.add(vertexStart);

        while (!nextToVisit.isEmpty()){
            String vertex = nextToVisit.remove();
            if(vertex.equals(vertexEnd)){
                return true;
            }

            if(visited.contains(vertex)){
                continue;
            }

            visited.add(vertex);

            for (String neighbour : vertexMap.get(vertex)){
                nextToVisit.add(neighbour);
            }
        }
        return false;
    }

    public void addVertex(String vertexName) {
        if (!isVertexInMap(vertexName)) {
            vertexMap.put(vertexName, new ArrayList<>());
        }
    }

    public boolean isVertexInMap(String vertexName) {
        return vertexMap.containsKey(vertexName);
    }

    public void addEdge(String vertexOne, String vertexTwo) {
        if (!isVertexInMap(vertexOne)) {
            addVertex(vertexOne);
        }
        if (!isVertexInMap(vertexTwo)) {
            addVertex(vertexTwo);
        }
        List<String> edges = vertexMap.get(vertexOne);
        edges.add(vertexTwo);
        Collections.sort(edges);
    }
}
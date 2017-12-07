package part4;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task41Test {
    private static Graph graph;

    @BeforeClass
    public static void testGraph() throws Exception {
        graph = new Graph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");

        graph.addEdge("A", "B");
        graph.addEdge("B", "F");
        graph.addEdge("B", "D");
        graph.addEdge("B", "C");
        graph.addEdge("D", "E");
        graph.addEdge("C", "A");
    }

    @Test
    public void testIsPathExist() throws Exception {
        boolean isCReachableFromF = graph.isPathExist("F", "C");
        boolean isDReachableFromA = graph.isPathExist("A", "D");

        assertTrue(isDReachableFromA);
        assertFalse(isCReachableFromF);
    }
}
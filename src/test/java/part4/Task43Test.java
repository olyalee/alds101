package part4;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class Task43Test {

    @Test
    public void testGetLevels() throws Exception {

        BinarySearchTree tree = new BinarySearchTree();

        tree.addNode(1, "One");
        tree.addNode(5, "Five");
        tree.addNode(3, "Three");
        tree.addNode(7, "Seven");

        assertNotNull(tree);

        HashMap<Integer, LinkedList<TreeNode>> levels = Task43.getLevels(tree);

        LinkedList<TreeNode> treeNodesOn0Level = levels.get(0);
        LinkedList<TreeNode> treeNodesOn1Level = levels.get(1);
        LinkedList<TreeNode> treeNodesOn2Level = levels.get(2);

        assertNotNull(levels);

        assertEquals(treeNodesOn0Level.get(0).value,"One");
        assertEquals(treeNodesOn1Level.get(0).value, "Five");
        assertEquals(treeNodesOn2Level.get(0).value, "Three");
        assertEquals(treeNodesOn2Level.get(1).value, "Seven");
    }
}
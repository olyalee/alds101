package part4;

import java.util.*;

/**
 * Для бинарного дерева поиска разработайте алгоритм, который создает связный список всех узлов,
 * находящихся на каждой глубине (для дерева с глубиной D должно получиться D связных списков)
 *
 *
 */
public class Task43 {

    public static HashMap<Integer, LinkedList<TreeNode>> getLevels(BinarySearchTree tree) {
        HashMap<Integer, LinkedList<TreeNode>> result = new HashMap<>();

        LinkedList<TreeNode> nodesOnLevel = new LinkedList<>();
        LinkedList<TreeNode> children = new LinkedList<>();

        int level = 0;
        nodesOnLevel.add(tree.root);

        result.put(level, new LinkedList<>(nodesOnLevel));

        while (!nodesOnLevel.isEmpty()) {
            for (TreeNode treeNode : nodesOnLevel) {
                TreeNode focus = nodesOnLevel.remove();
                if (focus.leftChild != null) {
                    children.add(focus.leftChild);
                }
                if(focus.rightChild != null) {
                    children.add(focus.rightChild);
                }
            }
            level++;
            result.put(level,new LinkedList<>(children));
            nodesOnLevel = new LinkedList<>(children);
            children.clear();
        }
        return result;
    }
}

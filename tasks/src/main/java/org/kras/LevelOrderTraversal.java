package org.kras;

import java.util.LinkedList;
import java.util.List;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,null,null,5};
        TreeNode root = TreeNode.createTree(array);
        List<List<Integer>> list = new LinkedList<>();
        levelOrder(root, 0, list);
        System.out.println(list);
    }

    private static void levelOrder(TreeNode root, int level, List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        if (result.size() == level) {
            result.add(new LinkedList<>());
        }
        result.get(level).add(root.val);
        levelOrder(root.left, level + 1, result);
        levelOrder(root.right, level + 1, result);
    }
}

package org.kras;

import java.util.LinkedList;
import java.util.List;

public class InOrderTravers {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9};
        TreeNode tree = TreeNode.createTree(nums);
        List<Integer> result = new LinkedList<>();
        inOrderTravers(tree, result);
        System.out.println(result);
    }

    private static void inOrderTravers(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        inOrderTravers(root.left, result);
        result.add(root.val);
        inOrderTravers(root.right, result);

    }
}

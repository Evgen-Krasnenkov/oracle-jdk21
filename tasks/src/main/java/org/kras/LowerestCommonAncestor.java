package org.kras;

import java.util.LinkedList;
import java.util.Queue;

/*
https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/
 */
public class LowerestCommonAncestor {
    public static void main(String[] args) {
        Integer[] arr = {3, 5, 1, 6, 2, 0, 8, null, null, 7, 4};
        TreeNode root = TreeNode.createTree(arr);
        TreeNode p = TreeNode.findNode(root, 5);
        TreeNode q = TreeNode.findNode(root, 1);
        root = TreeNode.createTree(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        p = TreeNode.findNode(root, 5);
        q = TreeNode.findNode(root, 4);
        TreeNode treeNode = lowestCommonAncestor(root, p, q);
        System.out.println(treeNode);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q || root == null) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) return root;
        return left == null ? right : left;
    }

    private static TreeNode buildTree(Integer[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == null) {
            return null;
        }

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();

            if (i < arr.length && arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.offer(current.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }
}

package org.kras;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {
        Integer[] root = {1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9};
        TreeNode tree = createTree(root);
        List<Integer> order = preOrderService(tree);
        System.out.println("Tree created with root value: " + order);
    }

    public static List<Integer> preOrderService(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        preOrderVoid(root, result);
        List<Integer> order = preOrder(root);
        return result;
    }

    private static List<Integer> preOrder(TreeNode node) {
        LinkedList<Integer> list = new LinkedList<>();
        if(node == null) {
            return list;
        }
        list.add(node.val);
        list.addAll(preOrder(node.left));
        list.addAll(preOrder(node.right));
        return list;
    }

    private static void preOrderVoid(TreeNode node, List<Integer> result) {
        if(node == null) {
            return;
        }
        result.add(node.val);
        preOrderVoid(node.left, result);
        preOrderVoid(node.right, result);
    }

    public static TreeNode createTree(Integer[] root) {
        if (root == null || root.length == 0) {
            return null;
        }
        TreeNode rootNode = new TreeNode(root[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(rootNode);

        int i = 1;
        while (!queue.isEmpty() && i < root.length) {
            TreeNode currentNode = queue.poll();
            if (root[i] != null) {
                currentNode.left = new TreeNode(root[i]);
                queue.add(currentNode.left);
            }
            i++;

            if (i < root.length && root[i] != null) {
                currentNode.right = new TreeNode(root[i]);
                queue.add(currentNode.right);
            }
            i++;
        }
        return rootNode;
    }
}
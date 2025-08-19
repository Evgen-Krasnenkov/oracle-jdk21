package org.kras;
/*
https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another/description/
 */
public class StepByStepPath {
    public static void main(String[] args) {
        TreeNode tree = TreeNode.createTree(new Integer[]{5, 1, 2, 3, null, 6, 4});
        String directions = getDirections(tree, 3, 6);
        System.out.println(directions);
    }

    public static String getDirections(TreeNode root, int start, int dest) {
        TreeNode lca = findLowestCA(root, start, dest);
        StringBuilder toStart = findPath(lca, start);
        StringBuilder toDest = findPath(lca, dest);
        return "U".repeat(toStart.length()) + toDest.toString();

    }

    private static StringBuilder findPath(TreeNode root, int target) {
        if (root == null) return null;
        if (root.val == target) return  new StringBuilder();
        StringBuilder left = findPath(root.left, target);
        if (left != null) {
            left.insert(0, "L");
            return left;
        }
        StringBuilder right = findPath(root.right, target);
        if (right != null) {
            right.insert(0, "R");
            return right;
        }
        return null;
    }

    private static TreeNode findLowestCA(TreeNode root, int start, int dest) {
        if (root == null || root.val == start || root.val == dest) return root;
        TreeNode left = findLowestCA(root.left, start, dest);
        TreeNode right = findLowestCA(root.right, start, dest);
        if (left != null && right != null) return root;
        return left != null ? left : right;
    }
}

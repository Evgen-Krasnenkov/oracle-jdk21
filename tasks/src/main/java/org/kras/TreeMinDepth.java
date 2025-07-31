package org.kras;

public class TreeMinDepth {
    public static void main(String[] args) {
        Integer[] nums = {2,null,3,null,4,null,5,null,6};
        TreeNode tree = TreeNode.createTree(nums);
        int i = calcDepth(tree);
        System.out.println(i);
    }

    private static int calcDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left != null && root.right != null) {
            return 1 + Math.min(calcDepth(root.right), calcDepth(root.left));
        } else if (root.left != null) {
            return 1 + calcDepth(root.left);
        } else {
            return 1 + calcDepth(root.right);
        }
    }
}

package org.kras;

import java.util.LinkedList;
import java.util.List;

public class PreOrderTree {
    public static void main(String[] args) {
        Integer[] nums = {1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14};
        Node root = Node.createTree(nums);
        final List<Integer> result = new LinkedList<>();
        preOrderTravers(root, result);
        System.out.println(result);
    }
    private static void preOrderTravers(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }
    }
}

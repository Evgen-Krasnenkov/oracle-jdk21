package org.kras;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }

    public static Node createTree(Integer[] nums) {
        Node root = null;
        if (nums == null || nums.length < 1) {
            return root;
        }
        Stack<Node> children = new Stack<>();
        for (Integer num : nums) {
            if (num == null) {
                children.pop();
            } else {
                Node node = new Node(num, new ArrayList<>());
                if (children.isEmpty()) {
                    root = node;
                } else {
                    children.peek().children.add(node);
                }
                children.push(node);
            }
        }
        return root;
    }
};
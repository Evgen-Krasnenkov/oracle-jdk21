package org.kras;

public class LinkedNode {
    int val;
    LinkedNode next;
    LinkedNode(int val, LinkedNode  next) {
        this.next = next;
        this.val = val;
    }

    LinkedNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "LinkedNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

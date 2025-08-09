package org.kras;


public class MergeSortedLinkedList {
    public static void main(String[] args) {
        LinkedNode list1 = new LinkedNode(1,
                new LinkedNode(2,
                        new LinkedNode(4, null)));

        LinkedNode list2 = new LinkedNode(1,
                new LinkedNode(3,
                        new LinkedNode(4, null)));
        LinkedNode merged = mergeLists(list1, list2);
        System.out.println(merged);

    }

    private static LinkedNode mergeLists(LinkedNode left, LinkedNode right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        if (left.val < right.val) {
            left.next = mergeLists(left.next, right);
            return left;
        } else {
            right.next = mergeLists(left, right.next);
            return right;
        }
    }
}

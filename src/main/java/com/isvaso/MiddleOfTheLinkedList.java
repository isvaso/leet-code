package com.isvaso;

/**
 * Given the head of a singly linked list,
 * return the middle node of the linked list. <br>
 * If there are two middle nodes, return the second middle node.
 * <br><br>
 *
 * Example 1: <br>
 * Input: head = [1,2,3,4,5] <br>
 * Output: [3,4,5] <br>
 * Explanation: The middle node of the list is node 3. <br><br>
 *
 * Example 2: <br>
 * Input: head = [1,2,3,4,5,6] <br>
 * Output: [4,5,6] <br>
 * Explanation: Since the list has two middle nodes with values 3 and 4,
 * we return the second one. <br><br>
 *
 * Constraints: <br>
 * <ul>
 *     <li>The number of nodes in the list is in the range [1, 100]</li>
 *     <li>1 <= Node.val <= 100</li>
 * </ul>
 * */
public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode middleList = head;
        int middleOfList = 0;

        while (middleList != null) {
            middleOfList++;
            middleList = middleList.next;
        }

        middleList = head;
        middleOfList = middleOfList / 2 + 1;

        for (int i = 1; i < middleOfList; i++) {
            middleList = middleList.next;
        }

        return middleList;
    }

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }
}

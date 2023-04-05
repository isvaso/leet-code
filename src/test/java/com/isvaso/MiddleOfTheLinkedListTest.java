package com.isvaso;

import org.junit.Test;

import static com.isvaso.MiddleOfTheLinkedList.ListNode;
import static org.junit.Assert.assertEquals;

public class MiddleOfTheLinkedListTest {

    @Test
    public void middleNode() {
        ListNode head = new ListNode(0,
                new ListNode(1,
                        new ListNode(2, new ListNode(3,
                                new ListNode(4)
                        ))));

        ListNode result = new MiddleOfTheLinkedList().middleNode(head);

        assertEquals(2, result.val);
    }
}
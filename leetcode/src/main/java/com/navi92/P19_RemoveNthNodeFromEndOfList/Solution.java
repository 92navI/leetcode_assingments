package com.navi92.P19_RemoveNthNodeFromEndOfList;

import java.util.ArrayList;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;

        ListNode current = head;
        int len = 0;
        while (true) {
            len++;
            if (current.next != null) {
                current = current.next;
            } else break;
        }

        if (len-n == 0) return head.next;

        current = head;
        int i = 0;
        while (true) {
            if (i<len-n-1) {
                current = current.next;
                i++;
            } else {
                current.next = current.next.next;
                break;
            }
        }

        return head;
    }
}

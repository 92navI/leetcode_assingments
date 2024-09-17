package com.navi92.P1_AddTwoNumbers;

import java.util.Objects;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var output = new ListNode();
        var current = output;
        byte overflow = 0;
        boolean able = true;
        while (able) {

            int sum = (Objects.isNull(l1) ? 0 : l1.val) + (Objects.isNull(l2) ? 0 : l2.val) + overflow;

            if (sum >= 10) {
                current.val = (sum - 10);

                overflow = 1;
            } else {
                current.val = sum;

                overflow = 0;
            }

            l1 = Objects.isNull(l1) ? null : l1.next;
            l2 = Objects.isNull(l2) ? null : l2.next;

            if (l1 == null && l2 == null) {
                able = false;
                if (overflow == 1) {
                    current.next = new ListNode(1);
                }
            } else {
                current.next = new ListNode();
                current = current.next;
            }
        }
        return output;
    }
}
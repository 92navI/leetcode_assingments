package com.navi92.P21_MergeTwoSortedLists;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        else if (list1 == null) return list2;
        else if (list2 == null) return list1;

        ListNode current1 = list1;
        ListNode current2 = list2;
        ListNode output = new ListNode();
        ListNode currentOutput = output;
        while (true) {
            if (current1.val <= current2.val) {
                currentOutput.next = new ListNode(current1.val);
                currentOutput = currentOutput.next;

                if (current1.next != null)
                    current1 = current1.next;
                else {
                    currentOutput.next = current2;
                    break;
                }
            } else {
                currentOutput.next = new ListNode(current2.val);
                currentOutput = currentOutput.next;

                if (current2.next != null)
                    current2 = current2.next;
                else {
                    currentOutput.next = current1;
                    break;
                }
            }
        }
        return output.next;
    }
}

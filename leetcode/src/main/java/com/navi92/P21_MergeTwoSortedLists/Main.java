package com.navi92.P21_MergeTwoSortedLists;

public class Main {
    public static void main(String[] args) {
        var sol = new Solution();

        ListNode input1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode input2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        System.out.println(sol.mergeTwoLists(input1, input2));
    }
}

package com.navi92.P19_RemoveNthNodeFromEndOfList;

public class Main {
    public static void main(String[] args) {
        var sol = new Solution();

        ListNode input = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int n = 2;

        System.out.println(sol.removeNthFromEnd(input, n));
    }
}

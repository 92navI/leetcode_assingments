package com.navi92.P19_RemoveNthNodeFromEndOfList;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        if (next != null) {
            return "{" + val + ", " + next + "}";
        } else {
            return "{" + val + "}";
        }
    }
}

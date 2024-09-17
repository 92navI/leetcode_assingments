package com.navi92.P1_AddTwoNumbers;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {
        var l1 = new ListNode(2, new ListNode(4, new ListNode(9)));
        var l2 = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(9))));

        var sol = new Solution();

        ListNode output = sol.addTwoNumbers(l1, l2);
        System.out.println(output);
    }
}

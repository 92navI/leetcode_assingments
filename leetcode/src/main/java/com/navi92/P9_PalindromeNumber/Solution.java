package com.navi92.P9_PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x <= 0) {
            return false;
        }

        int rev = 0;
        int temp = x;
        while (temp != 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }

        return x == rev;
    }
}

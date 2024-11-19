package com.navi92.P5_LongestPalindromicSubstring;

public class Solution {
    public String longestPalindrome(String s) {
        int b_start = 0;
        int b_end = 0;

        for (float i = 0f; i < s.length(); i += .5) {
            if (i == (int) i) {
                int start = (int) i;
                int end = (int) i;
                while (start - 1 >= 0 && end + 1 < s.length()) {
                    if (s.charAt(start - 1) == s.charAt(end + 1)) {
                        start -= 1;
                        end += 1;

                        if (end - start > b_end - b_start) {
                            b_end = end;
                            b_start = start;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                int start = (int) (i - .5);
                int end = (int) (i + .5);
                while (start >= 0 && end < s.length()) {
                    if (s.charAt(start) == s.charAt(end)) {
                        if (end - start > b_end - b_start) {
                            b_end = end;
                            b_start = start;
                        }

                        start -= 1;
                        end += 1;
                    } else {
                        break;
                    }
                }
            }
        }

        return s.substring(b_start, b_end + 1);
    }
    // public String longestPalindrome(String s) {
    // boolean[] array = new boolean[128];

    // int start = 0;
    // int end = 0;
    // for (int i = 0; i < s.length(); i++) {
    // char c = s.charAt(i);
    // if (array[c] == false) {
    // if (start == i - 1) {
    // end = i;
    // array[c] = true;
    // } else {
    // Arrays.fill(array, false);
    // array[c] = true;
    // if (i >= 2)
    // i -= 2;
    // start = i;
    // end = i;
    // }
    // } else {
    // if (start == i - 1) {
    // end = i;
    // } else if (start == i - 2 && s.charAt(i - 1) != c) {
    // end = i;
    // break;
    // } else {
    // Arrays.fill(array, false);
    // if (i >= 2)
    // i -= 2;
    // start = i+1;
    // end = i+1;
    // }
    // }
    // }
    // if (start - 1 >= 0 && end + 1 < s.length()) {
    // if (s.charAt(start - 1) == s.charAt(end + 1)) {
    // start -= 1;
    // end += 1;
    // }
    // }
    // return s.substring(start, end + 1);
    // }
}

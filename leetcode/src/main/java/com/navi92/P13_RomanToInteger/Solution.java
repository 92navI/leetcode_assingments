package com.navi92.P13_RomanToInteger;

public class Solution {

    public static final String[] r = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    public static final int[] n = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public int romanToInt(String s) {
        int d = 0;
        int i = 0;
        int output = 0;

        while (i < s.length()) {
            String ch = r[d];
            if (s.charAt(i) == ch.charAt(0)) {
                if (ch.length() == 2) {
                    if (i+1 < s.length() && s.charAt(i + 1) == ch.charAt(1)) {
                        output += n[d];
                        i+=2;
                    } else d++;
                } else {
                    output += n[d];
                    i++;
                }


            } else {
                d++;
            }
        }
        return output;
    }
}

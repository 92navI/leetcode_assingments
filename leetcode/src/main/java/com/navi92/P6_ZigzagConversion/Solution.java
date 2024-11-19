package com.navi92.P6_ZigzagConversion;

public class Solution {
    public String convert(String s, int numRows) {
        
        if (s.length() == 1 || numRows == 1) {
            return s;
        }

        String output = "";

        for (int row = 1; row <= numRows; row++) {
            int j1 = (numRows - row) * 2;
            int j2 = (numRows * 2 - 2) - j1;

            int i = row-1;
            if (i < s.length()) {
                output = output + s.charAt(i);
            }

            while (true) {

                i += j1;
                if (i < s.length() && row != numRows) {
                    output = output + s.charAt(i);
                } else if (row != numRows) {
                    break;
                }

                i += j2;
                if (i < s.length() && row != 1) {
                    output = output + s.charAt(i);
                } else if (row != 1 || numRows == 1) {
                    break;
                }
            }
        }
        return output;
    }
}
package com.navi92.P7_ReverseInteger;

public class Solution {
    public int reverse(int x) {
        boolean neg = x <= 0;

        if (neg)
            x *= -1;

        String s = x + "";

        StringBuffer sbr = new StringBuffer(s);
        sbr.reverse();
        try {
            int o = Integer.valueOf(sbr.toString());
            return neg ? o * -1 : o;
        } catch (Exception e) {
            return 0;
        }
    }
}

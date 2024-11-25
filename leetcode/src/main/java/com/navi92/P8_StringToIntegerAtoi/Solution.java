package com.navi92.P8_StringToIntegerAtoi;

import java.math.BigInteger;

public class Solution {
    public int myAtoi(String str) {
        String r = "";
        byte sign = 1;
        byte i = 0;
        while (i < str.length() && str.charAt(i)==' ') i++;

        if (i < str.length() && str.charAt(i)=='-') {
            sign = -1; i++;
        } else if (i < str.length() && str.charAt(i)=='+') i++;

        while (i < str.length() && str.charAt(i)=='0') i++;

        byte end = i;
        while (end < str.length() && Character.isDigit(str.charAt(end))) end++;

        r = str.substring(i, end);

        if (r.length() > 10 || r.length()==10 && Long.parseLong(r) > Integer.MAX_VALUE)
                return sign == 1 ?2147483647:-2147483648;

        return r.isEmpty() ?0:Integer.parseInt(r)*sign;
    }
}

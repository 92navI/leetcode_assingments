package com.navi92.P8_StringToIntegerAtoi;

public class Solution {
    public int myAtoi(String str) {
        String r = "";
        byte s = 1;
        for (char c:str.toCharArray()) {
            if (c=='+'||c==' ') {}
            else if (c=='-') s=-1;
            else break;
        }
        for (char c:str.toCharArray()) {
            if(c=='0') {}
            else if('0'<c&&c<='9') r+=c;
            else break;
        }

        return r==""?0:Integer.parseInt(r)*s;
    }
}

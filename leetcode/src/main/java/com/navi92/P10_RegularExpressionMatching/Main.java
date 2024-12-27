package com.navi92.P10_RegularExpressionMatching;

public class Main {
    public static void main(String[] args) {
        var sol = new Solution();

        String s = "aabdac";
        String p = "a*b.*c";

        System.out.println(sol.isMatch(s, p));
    }
}

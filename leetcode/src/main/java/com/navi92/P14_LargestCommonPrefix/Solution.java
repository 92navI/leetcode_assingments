package com.navi92.P14_LargestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder output = new StringBuilder();

        if(strs[0].isEmpty()) return "";

        String pref = strs[0];
        boolean flag = true;
        for (int i = 0; flag; i++) {
            char ch = pref.charAt(i);

            for (String s : strs) {
                if (s.isEmpty() || !(s.charAt(i) == ch)) return output.toString();
                if (!(i + 1 < s.length())) flag = false;
            }

            output.append(ch);
        }

        return output.toString();
    }
}

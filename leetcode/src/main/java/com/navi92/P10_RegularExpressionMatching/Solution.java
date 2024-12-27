package com.navi92.P10_RegularExpressionMatching;

class Solution {

    public boolean isMatch(String text, String pattern) {
        return dp(0, 0, text, pattern);
    }

    public boolean dp(int i, int j, String s, String p) {
        boolean ans;
        if (j == p.length()){
            ans = i == s.length();
        } else{
            boolean match = (i < s.length() &&
                    (p.charAt(j) == s.charAt(i) ||
                            p.charAt(j) == '.'));

            if (j + 1 < p.length() && p.charAt(j+1) == '*'){
                ans = (dp(i, j+2, s, p) ||
                        match && dp(i+1, j, s, p));
            } else {
                ans = match && dp(i+1, j+1, s, p);
            }
        }
        return ans;
    }

    public boolean isMatch1(String s, String p) {
        if (p.equals(".*")) {
            return true;
        }

        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (y == p.length()) return false;

            char comp = p.charAt(y);
            if (comp == '*') {
                comp = p.charAt(y - 1);
                if (!(comp == s.charAt(i) || comp == '.')) {
                    i--;
                    y++;
                }
            } else if ((comp == s.charAt(i) || comp == '.')) {
                y++;
            } else if (p.charAt(y+1) == '*') {
                y+=2;
            } else {
                return false;
            }
        }

        y = p.length()-1;
        for (int i = s.length()-1; i >= 0; i--) {
            if (y == 0) return false;

            char comp = p.charAt(y);
            if (comp == '*') {
                comp = p.charAt(y + 1);
                if (!(comp == s.charAt(i) || comp == '.')) {
                    i++;
                    y--;
                }
            } else if ((comp == s.charAt(i) || comp == '.')) {
                y--;
            } else {
                return false;
            }
        }
        return true;
    }
}



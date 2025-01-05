package com.navi92.P20_ValidParentheses;

import java.util.LinkedList;

public class Solution {
    public boolean isValid(String s) {
        if (s.length()<2) return false;

        LinkedList<Character> res = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '{':
                    res.push('{');
                    break;
                case '(':
                    res.push('(');
                    break;
                case '[':
                    res.push('[');
                    break;
                case '}':
                    if (!res.isEmpty() && res.getFirst()=='{')
                            res.pop();
                    else return false;
                    break;
                case ')':
                    if (!res.isEmpty() && res.getFirst()=='(')
                        res.pop();
                    else return false;
                    break;
                case ']':
                    if (!res.isEmpty() && res.getFirst()=='[')
                        res.pop();
                    else return false;
                    break;
            }
        }

        return res.isEmpty();
    }
}

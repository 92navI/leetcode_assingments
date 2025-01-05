package com.navi92.P17_LetterCombinationOfAPhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static final char[][] map = {
            new char[]{'a', 'b', 'c'},
            new char[]{'d', 'e', 'f'},
            new char[]{'g', 'h', 'i'},
            new char[]{'j', 'k', 'l'},
            new char[]{'m', 'n', 'o'},
            new char[]{'p', 'q', 'r', 's'},
            new char[]{'t', 'u', 'v'},
            new char[]{'w', 'x', 'y', 'z'}
    };

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.isEmpty()) return list;

        int[] ints = new int[digits.length()];
        for (int i = 0; i < digits.length(); i++) ints[i] = digits.charAt(i) - '2';
        int[] pointers = new int[ints.length];

        boolean flag = true;
        while (flag) {
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < pointers.length; i++) {
                str.append(map[ints[i]][pointers[i]]);
            }
            list.add(str.toString());
            for (int i = pointers.length - 1; i >= 0; i--) {
                if (pointers[i] + 1 < map[ints[i]].length) {
                    pointers[i]++;
                    break;
                } else if (!(i == 0)) {
                    pointers[i] = 0;
                } else {
                    flag = false;
                    break;
                }
            }
        }

        return list;
    }
}

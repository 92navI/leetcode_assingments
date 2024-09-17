package com.navi92.P3_LongestSubstringWithoutRepeatingCharacters;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        if (s.isEmpty()) return 0;
        int greatest = 1;

        for (int i = 0; i < s.length(); i++) {
            String accepted = String.valueOf(chars[i]);
            int output = 1;
            for (int y = i+1; y < s.length(); y++) {
                if (!accepted.contains(String.valueOf(chars[y]))) {
                    accepted=accepted+String.valueOf(chars[y]);
                    output++;
                } else break;
            } if (output>=greatest) {
                greatest=output;
            }
        }

        return greatest;
    }

    public int lengthOfLongestSubstringOptimized(String s) {
        int[] array = new int[128];
        int start = 0;
        int max = 0 ;
        for (int i = 0; i < 128; i++) array[i]=-1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (array[ch]>=start)start=array[ch]+1;
            array[ch]=i;
            max=Math.max(max,i-start+1);
        }
        return max;
    }
}
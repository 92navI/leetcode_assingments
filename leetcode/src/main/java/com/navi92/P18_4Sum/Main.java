package com.navi92.P18_4Sum;

public class Main {
    public static void main(String[] args) {
        var sol = new Solution();

        int[] input = {1,0,-1,0,-2,2};
        int target = 0;

        System.out.println(sol.fourSum(input, target));
    }
}

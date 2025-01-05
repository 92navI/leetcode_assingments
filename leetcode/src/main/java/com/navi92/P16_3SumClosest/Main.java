package com.navi92.P16_3SumClosest;

public class Main {
    public static void main(String[] args) {
        var sol = new Solution();

        int[] input = {-2, 0, 1, 3, 4};
        int target = 0;

        System.out.println(sol.threeSumClosest(input, target));
    }
}

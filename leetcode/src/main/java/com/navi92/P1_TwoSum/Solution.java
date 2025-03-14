package com.navi92.P1_TwoSum;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.stream.IntStream;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        AtomicIntegerArray array = new AtomicIntegerArray(2);
        IntStream.range(0, nums.length).forEach(i -> {
            IntStream.range(i + 1, nums.length).forEach(y -> {
                if (nums[i] + nums[y] == target) {
                    System.out.println(i + " " + y);
                    array.set(0, i);
                    array.set(1, y);
                }
            });
        });
        return new int[] { array.get(0), array.get(1) };
    }
}

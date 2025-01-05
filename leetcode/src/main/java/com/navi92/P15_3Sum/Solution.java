package com.navi92.P15_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for (int x = 0; x < nums.length; x++) {
            if (x > 0 && nums[x] == nums[x - 1]) continue;

            int xv = -nums[x];

            int y = x + 1;
            int z = nums.length - 1;
            while (y < z) {
                int sum = nums[y] + nums[z];
                if (sum > xv) {
                    z--;
                } else if (sum < xv) {
                    y++;
                } else {
                    list.add(List.of(nums[x], nums[y], nums[z]));
                    y++;
                    while (nums[y] == nums[y - 1] && y < z) y++;
                }
            }
        }

        return list;
    }
}

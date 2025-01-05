package com.navi92.P16_3SumClosest;

import java.util.Arrays;

public class Solution {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];
        int diff = Math.abs(target - sum);

        for (int x = 0; x < nums.length; x++) {
            if (x > 0 && nums[x] == nums[x - 1]) continue;

            int y = x + 1;
            int z = nums.length - 1;
            while (y < z) {
                int nsum = nums[x] + nums[y] + nums[z];
                if (nsum >= target) {
                    z--;
                } else {
                    y++;
                }
                int ndif = Math.abs(target - nsum);
                if (ndif < diff) {
                    sum = nsum;
                    diff = ndif;
                }
            }
        }

        return sum;
    }
}

package com.navi92.P18_4Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int len = nums.length;

        for (int w = 0; w < len; w++) {
            if (w > 0 && nums[w - 1] == nums[w]) continue;
            for (int x = w + 1; x < len; x++) {
                if (x > w + 1 && nums[x - 1] == nums[x]) continue;

                int y = x + 1;
                int z = len - 1;
                while (y < z) {
                    long sum = (long) nums[w] + (long) nums[x] + (long) nums[y] + (long) nums[z];
                    if (sum > target) {
                        z--;
                    } else if (sum < target) {
                        y++;
                    } else {
                        List<Integer> output = List.of(nums[w], nums[x], nums[y], nums[z]);
                        if (!list.contains(output)) list.add(output);

                        y++;
                        while (nums[y] == nums[y - 1] && y < z) y++;
                    }
                }
            }
        }

        return list;
    }
}

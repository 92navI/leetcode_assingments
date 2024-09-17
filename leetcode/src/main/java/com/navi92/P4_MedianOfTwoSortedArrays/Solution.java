package com.navi92.P4_MedianOfTwoSortedArrays;

import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length+nums2.length;
        int[] merged = new int[len];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);

        if (merged.length%2==0) {
            return (merged[(len - 1) / 2] + merged[len / 2])/2.0;
        } else {
            return merged[(len-1)/2];
        }
    }
}
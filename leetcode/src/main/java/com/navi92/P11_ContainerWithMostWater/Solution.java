package com.navi92.P11_ContainerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
        int a = 0;
        int z = height.length-1;
        int max = 0;

        while (z>a) {
            int ah = height[a];
            int zh = height[z];

            if (ah>zh) {
                int vol = zh*(z-a);
                if (vol > max) max = vol;
                z--;
            } else {
                int vol = ah*(z-a);
                if (vol > max) max = vol;
                a++;
            }
        }

        return max;
    }
}

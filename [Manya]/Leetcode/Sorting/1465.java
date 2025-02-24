package Sorting;

import java.util.Arrays;

class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        long maxH = Math.max(horizontalCuts[0], h-horizontalCuts[horizontalCuts.length - 1]);
        long maxW = Math.max(verticalCuts[0], w-verticalCuts[verticalCuts.length - 1]);
        
        for(int i = 1; i < horizontalCuts.length; i++){
            maxH = Math.max(horizontalCuts[i]-horizontalCuts[i-1], maxH);
        }
        for(int i = 1; i < verticalCuts.length; i++){
            maxW = Math.max(verticalCuts[i]-verticalCuts[i-1], maxW);
        }
        long area = (maxH * maxW)% 1000000007;
        return (int)(area );
    }
}

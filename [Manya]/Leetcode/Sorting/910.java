package Sorting;

import java.util.Arrays;

class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);

        int bestL = nums[0] + k;
        int bestR = nums[nums.length - 1] - k;
        int result = nums[nums.length - 1] - nums[0];

        for(int i = 0; i < nums.length - 1; i++){
            int min = Math.min(nums[i+1] - k , bestL);
            int max = Math.max(nums[i] + k , bestR);
            result = Math.min(result, max-min);
        }
        return result;
    }
}
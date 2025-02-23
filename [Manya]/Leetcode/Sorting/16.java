package Sorting;

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int currDiff = 0;
        int closestSum = 0;
        int i;

        for(i = 0; i < nums.length - 2; i++){
            int j = i+1;
            int k = nums.length - 1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                currDiff = Math.abs(target - sum);

                if(currDiff < diff){
                diff = currDiff;
                closestSum = sum;
                }

                if(sum < target){
                    j++;
                } 
                else{
                    k--;
                }
            }
        }
        return closestSum;
    }
}

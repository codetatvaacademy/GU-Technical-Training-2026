package Sorting;

import java.util.Arrays;

class Solution {
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        
        Arrays.sort(nums);

        int arr[] = new int[nums.length + 1];

        for(int i = 0; i < requests.length; i++){
            arr[requests[i][0]] += 1;
            arr[requests[i][1] + 1] -= 1;
        }
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i] + arr[i-1];
        }
        Arrays.sort(arr);

        long sum = 0;

        for(int i = arr.length - 1; i > 0; i--){
            long a = nums[i-1];
            long b = arr[i];
            long ans = a * b;
            sum += ans;
        }
        return (int)(sum % 1000000007);
    }
}
package Sorting;

class Solution {
    public int minIncrementForUnique(int[] nums) {
        int maxElement = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            maxElement = Math.max(maxElement, nums[i]);
        }
        int extra = 0;
        int move = 0;

        int[] arr = new int[nums.length + maxElement];

        for(int i : nums){
            arr[i]++;
        }

        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > 1){
                extra = arr[i] - 1;
                arr[i+1] += extra;
                move += extra;                
            }
        }
        return move;
    }
}

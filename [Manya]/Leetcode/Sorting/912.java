package Sorting;

import java.util.Arrays;

class Solution {
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);  
        return nums;  
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {5, 2, 3, 1, 6, 4};
        System.out.println("Sorted Array: " + Arrays.toString(solution.sortArray(nums)));
    }
}

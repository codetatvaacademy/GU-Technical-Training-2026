class Solution {
    public int searchInsert(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2; // Correct the calculation of mid

            if (target == nums[mid]) {
                return mid; // If target is found, return its index
            }
            if (target > nums[mid]) {
                start = mid + 1; // If target is greater, move to the right half
            } else {
                end = mid - 1; // If target is smaller, move to the left half
            }
        }
        
        // If target is not found, return the insertion position
        return start;
    }
}

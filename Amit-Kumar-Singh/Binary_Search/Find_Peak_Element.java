//Time Complexity: O(logn)
//Space Complexity: O(1)
class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int mid;
        while(left<right){
            mid = (left+right)/2;
            if(nums[mid]>nums[mid+1]){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
}
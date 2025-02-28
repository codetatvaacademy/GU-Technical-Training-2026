class Solution {
    public void reverse(int[] nums, int start, int end){
        while(start<=end){
            int t=nums[start];
            nums[start]=nums[end];
            nums[end]=t;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
}
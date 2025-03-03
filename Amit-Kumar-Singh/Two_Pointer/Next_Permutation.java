class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i+1]<=nums[i]){
            i--;
        }
        if(i>=0){
            int j = n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
        reverse(nums,i+1);
    }
    public void reverse(int[] nums, int start){
        int j = nums.length-1;
        while(start<j){
            int temp = nums[start];
            nums[start] = nums[j];
            nums[j] = temp;
            j--;
            start++;
        }
    }
}
class Solution {
    public void reverse(int[] nums, int start , int end) {
        while(start <= end ) {
            swap(nums, start, end);
            start ++;
            end --;
        }
    }
    public  void swap (int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    public void nextPermutation(int[] nums) {
        int j = 0;
        for(int i = nums.length - 1; i > 0; i--) {
            if(nums[i] > nums[i-1]) {
                j = i;
                break;
            }
        }
        if(j == 0){
            reverse(nums , 0 , nums.length-1);
        }
        else{
            reverse(nums, j, nums.length-1);
            for(int i = j ; i < nums.length; i++) {
              if(nums[i] > nums[j-1]) {
                swap(nums, i, j-1);
                break;
              }
        }
    }
}

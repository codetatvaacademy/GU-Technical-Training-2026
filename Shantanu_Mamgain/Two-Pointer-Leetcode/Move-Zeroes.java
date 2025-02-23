class Solution {
    public void swap(int[] nums, int i, int zero){
        int temp = nums[i];
        nums[i] = nums[zero];
        nums[zero] = temp;
    }
    public void moveZeroes(int[] nums) {
        int zero = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zero = i;
                break;
            }
        }
      
        if(zero == -1){
            return;
        }

        for(int i = zero+1; i < nums.length; i++){
            if(nums[i] != 0){
                swap(nums, i, zero);
                zero ++;
            }
        }
    }
}

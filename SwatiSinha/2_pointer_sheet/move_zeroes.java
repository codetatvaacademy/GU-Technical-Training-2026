class Solution {
    public void moveZeroes(int[] nums) {
        int i=-1; 
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=0){
                i++;
                int t= nums[i];
                nums[i]=nums[j];
                nums[j]=t;
            }
        }
    }
}
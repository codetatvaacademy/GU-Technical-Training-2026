class Solution {
    public int pivotIndex(int[] nums) { 
        for(int i = 1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }

        for(int i =0; i<nums.length;i++){
            if(i==0){
                if(nums[i]==nums[nums.length-1]){
                    return i;
                }
            }
            else{
                if(nums[i]==nums[nums.length-1]-nums[i-1]){
                    return i;
                }
            }
        }

        return -1;
    }
}

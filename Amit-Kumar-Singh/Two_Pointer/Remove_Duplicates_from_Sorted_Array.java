class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr1 = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[ptr1]!=nums[i]){
                ptr1++;
                nums[ptr1]=nums[i];
            }
        }
        return ptr1+1;
    }
}
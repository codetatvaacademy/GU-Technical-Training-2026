class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        int count = 0;
        for(int i = 1; i < nums.length ; i++){
            if(nums[i - 1] != nums[i]){
                int temp = nums[i - 1];
                nums[i - 1] = nums[j];
                nums[j] = temp;
                j++;
                count++;
            }
        }
        nums[j] = nums[nums.length - 1];
        count++;
        return count;
    }
}

class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if(nums[nums.length-1]<target)
        {
            return nums.length;
        }
        if(nums[0]>target)
        {
            return 0;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target) {  
            return i;
            }
        }
       for(int i=1;i<nums.length;i++)
       {
        if(nums[i-1]<target && nums[i]>target)
        return i;
       }
       return -1;
    }
}
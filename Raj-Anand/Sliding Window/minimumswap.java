class minimumswap {
    public int minSwaps(int[] nums) {
        int start=0;
        while(start<nums.length){
            if(nums[start]==1){
                break;

            }
            ++start;

        }
        int end=nums.length-1;
        while(end>=0){
            if(nums[end]==1){
                break;
            }
            --end;
        }
        return 

        
    }
}

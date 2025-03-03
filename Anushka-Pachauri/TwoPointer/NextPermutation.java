class NextPermutation {
    public void reverse(int[] nums,int start, int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int end=nums.length-2;
        while(end>=0 && nums[end]>=nums[end+1]){
            end--;
        }
        if(end!=-1){
            int swapIndex=end+1;
            while(swapIndex<nums.length && nums[swapIndex]>nums[end]){
            swapIndex++;
            }
            swapIndex--;
            int temp=nums[end];
            nums[end]=nums[swapIndex];
            nums[swapIndex]=temp;
        }
        reverse(nums,end+1,nums.length-1);
    }
}
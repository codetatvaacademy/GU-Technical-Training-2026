class RangeSumQueryImmutable {
    int[] nums;
    public RangeSumQueryImmutable(int[] nums) {
        this.nums=nums;
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
            return left==0 ? nums[right] : nums[right] - nums[left-1];
    }
}
class NumArray {
    int [] nums;
    public NumArray(int[] nums) {
        this.nums= nums;
        for(int i =1 ;i<nums.length; i++){
            nums[i]=nums[i]+nums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        
        int sum =0;
        if(left<=right){
            if(left ==0){
            sum= nums[right];
            }
            else{
                sum = nums[right]-nums[left-1];
            }
        }
        return sum;
    }
}

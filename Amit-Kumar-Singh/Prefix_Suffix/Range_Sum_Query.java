//Time Complexity: O(n+q)
//Space Complexity: O(1)
class NumArray {
    int [] nums;
    public NumArray(int[] nums) {
        this.nums=nums;
        for(int i=1;i<nums.length;i++){
            this.nums[i] += this.nums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left!=0){
            return this.nums[right]-nums[left-1];
        }
        else return this.nums[right];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int start=0;
        int end=0;
        int product=1;
        int subCount=0;
        while(end<nums.length){
            product*=nums[end];
            while(start<=end && product>=k){
                product/=nums[start];
                start++;
            }
            subCount+=end-start+1;
            ++end;
        }
        return subCount;
    }
}
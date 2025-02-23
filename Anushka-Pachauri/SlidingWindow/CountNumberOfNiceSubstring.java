class Solution {
    public int calculateNiceCount(int[] nums,int k){
        int start=0;
        int end=0;
        int niceCount=0;
        while(end<nums.length){
            if(nums[end]%2!=0){
                k--;
            }
            while(k<0){
                if(nums[start]%2!=0){
                    k++;
                }
                start++;
            }
            niceCount+=end-start+1;
            end++;
        }
        return niceCount;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return calculateNiceCount(nums,k)-calculateNiceCount(nums,k-1);
    }
}
class Solution {
    public int atMost(int[] nums, int k){
        int count = 0;
        int sub = 0;
        for(int i=0 , j = 0; i<nums.length;i++){
            count += nums[i]%2;
            while(count>k){
                count -= nums[j++]%2;
            }
            sub+= (i-j+1);
        }
        return sub;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums,k) - atMost(nums,k-1);
    }
}
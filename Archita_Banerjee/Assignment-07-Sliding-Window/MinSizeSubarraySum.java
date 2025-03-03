public class MinSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int start=0;
        int end=0;
        int minlen=-1;
        int sum=0;
        while(end<n){
            sum += nums[end];
            while(sum>=target){
                if( minlen==-1|| end-start+1<minlen){
                    minlen= end-start+1;
                }
                sum-=nums[start];
                start++;
            }
            end++;
        }
        return minlen==-1?0:minlen;
    }
}

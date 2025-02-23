public class SubarrayProductK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int start=0;
        int end=0;
        int cnt=0;
        int product=1;
        while(end<nums.length ){
            product = product* nums[end];
            while(product>=k){
                product /=nums[start];
                start++;
            }
            cnt+= end-start+1;
            end++;
        }
        return cnt;
    }
}

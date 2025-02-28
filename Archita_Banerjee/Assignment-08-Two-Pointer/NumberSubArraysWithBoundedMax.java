public class NumberSubArraysWithBoundedMax {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int i=0;
        int cnt=0;
        int valid=0;
        int start=-1;
        while(i<nums.length){
            if(nums[i]>right){
                start=i;
                valid=0;
            }else if(nums[i]>=left && nums[i]<=right){
                valid= i-start;
                cnt+=valid;
            }else{
                cnt+=valid;
            }
            i++;
        }
        return cnt;
    }
}

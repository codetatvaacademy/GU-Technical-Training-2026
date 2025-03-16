public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int start=0;
        int end=0;
        int cntZ=0;
        int maxLen=0;
        while(end<nums.length){
            if(nums[end]==0){
                cntZ++;
            }
            while(cntZ>k){
                if(nums[start]==0){
                    cntZ--;
                }
                start++;
            }
            maxLen=Math.max(maxLen, end-start+1);
            end++;
        }
        return maxLen;
    }
}

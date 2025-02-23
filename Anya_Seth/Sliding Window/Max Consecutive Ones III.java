class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int ans = 0;
        int maxLength  = 0;
        int zeroCount = 0;
        while(end < nums.length){
            if(nums[end] == 0){
                zeroCount++;
            }
            while(zeroCount > k){
                if(nums[start] == 0){
                    zeroCount--;
                }
                start++;
            }
            maxLength = end - start + 1;
            ans = Math.max(ans, maxLength);
            end++;
        }
    return ans;
}
}

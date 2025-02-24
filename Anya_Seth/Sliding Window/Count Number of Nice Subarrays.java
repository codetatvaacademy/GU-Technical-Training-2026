class Solution {
    public int numberOfSubarrays(int[] nums, int k){
        return niceCount(nums, k) - niceCount(nums, k-1);
    }
    public static int niceCount(int[] nums, int k){
        int start = 0;
        int end = 0;
        int niceCount = 0;
        while(end < nums.length){
            if(nums[end] % 2 != 0){
                k--;
            }
            while(k < 0){
            if(nums[start] % 2 != 0){
                k++;
            }
                start++;
            }
            niceCount += (end - start) + 1;
            end++;
        }
        return niceCount;
    }
}

class Solution {
    public int longestOnes(int[] nums, int k) {
        int count = 0;
        int maxOnes = 0;
        int flip = 0;
        int start = 0;
        for(int end = 0;end < nums.length; end++){
            count += nums[end];
            if(nums[end]==0){
                flip++;
                count++;
            }
            while(flip > k){
                count -= nums[start];
                if(nums[start]== 0){
                    flip--;
                    count--;
                }
                start++;
            }
            maxOnes = Math.max(count, maxOnes);
        }
        return maxOnes;
    }
}
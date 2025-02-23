class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       int[] ans = new int[nums.length - k + 1];
       int[] leftMax = new int[nums.length];
       int[] rightMax = new int[nums.length];
       leftMax[0] = nums[0];
       for(int i = 1 ; i < nums.length ; i++){
          if(i % k  == 0){
            leftMax[i] = nums[i];
          }
          else{
          leftMax[i] = Math.max(leftMax[i-1] , nums[i]);
          }
       }
       rightMax[nums.length - 1] = nums[nums.length - 1];
       for(int i = nums.length - 2 ; i >= 0 ; i--){
          if((i+1) % k  == 0){
            rightMax[i] = nums[i];
          }
          else{
          rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
          }
        } 
       for(int i = 0 ; i < ans.length ; i++){
          ans[i] = Math.max(leftMax[i + k - 1], rightMax[i]);
        }
        return ans;
    }
}

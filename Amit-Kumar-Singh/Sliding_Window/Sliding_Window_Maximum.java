class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int window = 0;
        int windowMax = -1001;
        for(int i=0;i<n;i++){
            window++;
            if(window>k){
                window = 1;
                windowMax  = -10001;
            }
            windowMax = Math.max(windowMax,nums[i]);
            leftMax[i] = windowMax;
        }
        window = 0;
        for(int i=n-1;i>=0;i--){
            window++;
            if(i % k-1 == k-2){
                window = 1;
                windowMax  = -10001;
            }
            windowMax = Math.max(windowMax,nums[i]);
            rightMax[i] = windowMax;
        }
        int[] ans = new int[n-k+1];
        //System.out.println(Arrays.toString(leftMax)+"\n"+Arrays.toString(rightMax));
        for(int i=0;i<ans.length;i++){
            ans[i] = Math.max(leftMax[i+k-1],rightMax[i]);
        }
        return ans;
    }
}
//Time Complexity: O(nlog(maxBananas))
//Space Complexity: O(1)
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxBananas = 0;
        for(int i=0;i<piles.length;i++){
            maxBananas = Math.max(maxBananas,piles[i]);
        }
        return binarySearch(1, maxBananas, piles, h);
    }
    public static int binarySearch(int start, int end, int[] nums, int h){
        int ans = Integer.MAX_VALUE;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(helper(nums, nums.length, h, mid)){
                end = mid-1;
                ans = Math.min(ans,mid);
            }
            else{
                start = mid+1;
            }
        }
        return ans == Integer.MAX_VALUE ? 0:ans;
    }
    public static boolean helper(int[] nums,int n,int h,int k){ //use modulo operation instead
        long totalHours = 0;
        for(int i = 0; i < n; i++){
        totalHours += (long)(nums[i] + k - 1) / k;
        }
        return totalHours <= h;
    }
}

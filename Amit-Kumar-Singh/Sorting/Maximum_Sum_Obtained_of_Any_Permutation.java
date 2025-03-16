class Solution {
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        Arrays.sort(nums);
        int n = nums.length;
        long[] prefix = new long[n+1];
        for(int i=0;i<requests.length;i++){
            prefix[requests[i][0]]++;
            prefix[requests[i][1]+1]--;
        }
        for(int i=1;i<n+1;i++){
            prefix[i] += prefix[i-1];
        }
        Arrays.sort(prefix);
        long maxSum = 0;
        for(int i=n-1;i>=0;i--){
            maxSum += prefix[i+1]*nums[i];
        }
        return (int)(maxSum%(Math.pow(10,9)+7));
    }
}

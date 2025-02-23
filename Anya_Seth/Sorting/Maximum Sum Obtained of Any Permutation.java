class Solution {
    public int maxSumRangeQuery(int[] nums, int[][] requests){
        int mod = (int) 1e9 + 7;
        long sum = 0;
        Arrays.sort(nums);
        int[] arr = new int[nums.length + 1];
        for(int i = 0 ; i < requests.length ; i++){
            arr[requests[i][0]] += 1;
            arr[requests[i][1] + 1] -= 1;
        }
        
        for(int i = 1 ; i < arr.length ; i++){
            arr[i] = arr[i - 1] + arr[i];
        }
        Arrays.sort(arr);
        for(int i = arr.length - 1 ; i > 0 ; i--){
            sum = (sum + (long) nums[i - 1] * arr[i]) % mod;
        }
        return (int) sum;
    }
}

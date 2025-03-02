class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return subarraylessthanorequalto(nums, k) - subarraylessthanorequalto(nums, k - 1);
    }

    public int subarraylessthanorequalto(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int ans = 0;
        int n = nums.length;
        while (end < n) {
            if (nums[end] % 2 == 1) {
                k--;
            }
            while (k < 0) {
                if (nums[start] % 2 == 1) {
                    k++;
                }
                start++;
            }
            ans += end - start + 1;
            end++;
        }
        return ans;
    }
}

class Solution {
    public int minOperations(int[] nums, int x) {
        int Tsum = 0;
        for (int num : nums) {
            Tsum += num;
        }
        int target = Tsum - x;
        if (target < 0)
            return -1;
        if (target == 0)
            return nums.length;
        int maxLength = -1;
        int currentSum = 0;
        int s = 0;
        for (int e = 0; e < nums.length; e++) {
            currentSum += nums[e];

            while (currentSum > target && s <= e) {
                currentSum -= nums[s];
                s++;

            }
            if (currentSum == target) {
                int currentLength = e - s + 1;
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength == -1 ? -1 : nums.length - maxLength;
    }
}
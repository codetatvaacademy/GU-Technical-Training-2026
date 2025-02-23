class Solution {
    public int minSwaps(int[] nums) {
        int countOne = 0;
        int start = 0;
        int end = 0;
        for (int num : nums) {
            countOne+=num;
        }
        if (countOne == 0 || countOne == nums.length) {
            return 0;
        }
        int minSwaps = Integer.MAX_VALUE;
        int swaps = 0;
        while (end < (nums.length + countOne - 1)) {
            if (nums[end % nums.length] == 0) {
                swaps++;
            }
            if ((end - start + 1) == countOne) {
                minSwaps = Math.min(minSwaps, swaps);
                if (nums[start % nums.length] == 0) {
                    swaps--;
                }
                start++;
            }
            end++;
        }
        return minSwaps;
    }
}
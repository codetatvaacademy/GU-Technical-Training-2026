class Solution {
    public int minSwaps(int[] nums) {
        // WINDOW SIZE
        int windowSize = 0;
        for (int num : nums) {

            windowSize += num;
        }
        // find zeros
        int curZero = 0;
        for (int i = 0; i < windowSize; i++) {
            if (nums[i] == 0) {
                curZero++;
            }
        }
        int minZeros = curZero;
        int start = 0;
        int end = windowSize - 1;
        int n = nums.length;
        while (start < n) {
            if (nums[start] == 0) {
                curZero--;
            }
            start++;
            end++;
            if (nums[end % n] == 0) {
                curZero++;
            }
            minZeros = Math.min(minZeros, curZero);
        }
        return minZeros;

    }

}

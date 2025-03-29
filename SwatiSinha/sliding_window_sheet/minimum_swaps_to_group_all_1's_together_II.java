class Solution {
    public int minSwaps(int[] nums) {
        int ones = 0;
        for (int num : nums) {
            if (num == 1)
                ones++;
        }

        if (ones == 0 || ones == nums.length) {
            return 0;
        }

        int[] doubledNums = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            doubledNums[i] = nums[i];
            doubledNums[i + nums.length] = nums[i];
        }

        int currZeros = 0;
        for (int i = 0; i < ones; i++) {
            if (doubledNums[i] == 0)
                currZeros++;
        }
        int minZeros = currZeros;

        for (int i = 1; i < nums.length; i++) {
            if (doubledNums[i - 1] == 0) {
                currZeros--;
            }
            if (doubledNums[i + ones - 1] == 0) {
                currZeros++;
            }
            minZeros = Math.min(minZeros, currZeros);
        }
        return minZeros;
    }
}
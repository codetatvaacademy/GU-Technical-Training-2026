class Solution {
    public int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];

        }
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        return min > 0 ? 1 : 1 - min;
    }

}

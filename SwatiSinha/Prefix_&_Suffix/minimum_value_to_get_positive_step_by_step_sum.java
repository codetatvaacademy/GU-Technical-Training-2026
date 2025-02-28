class Solution {
    public int minStartValue(int[] nums) {
        int startValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
            startValue = Math.min(startValue, nums[i]);
        }
        return startValue < 1 ? startValue * (-1) + 1 : 1;
    }
}

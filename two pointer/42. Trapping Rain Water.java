class Solution {
    public int trap(int[] height) {
        int[] lm = new int[height.length];
        int[] rm = new int[height.length];
        int sum = 0;
        lm[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            lm[i] = Math.max(lm[i - 1], height[i]);
        }
        rm[height.length - 1] = height[height.length - 1];
        for (int j = height.length - 2; j >= 0; j--) {
            rm[j] = Math.max(rm[j + 1], height[j]);
        }
        for (int k = 0; k < height.length; k++) {
            sum += Math.min(lm[k], rm[k]) - height[k];
        }
        return sum;
    }
}
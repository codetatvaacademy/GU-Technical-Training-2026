class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            if (height[left] > height[right]) {
                int area = height[right] * (right - left);
                maxArea = Math.max(area, maxArea);
                right--;
            } else {
                int area = height[left] * (right - left);
                maxArea = Math.max(area, maxArea);
                left++;
            }
        }
        return maxArea;
    }
}
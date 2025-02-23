class Solution {
public:
    int maxArea(vector<int>& height) {
        int maxWater = 0;
        int left = 0, right = height.size() - 1;
        while (left < right) {
            int minHeight = min(height[left], height[right]);
            maxWater = max(maxWater, minHeight * (right - left));
            if (height[left] <= height[right]) {
                ++left;
            } else {
                --right;
            }
        }
    }
};
class Solution {
    public int maxArea(int[] height) {
      int MaxArea = 0;
      int left = 0;
      int right = height.length - 1;

      while(left < right){
        int currHeight = Math.min(height[left], height[right]);
        int area = (right - left) * currHeight;
        MaxArea = Math.max(MaxArea, area);

        if(height[left] < height[right]){
            left++;
        }
        else{
            right--;
        }
      }
      return MaxArea;
    }
}
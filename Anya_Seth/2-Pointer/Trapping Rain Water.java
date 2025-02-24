class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int trap = 0;
        while(i < j){
            if(height[i] < height[j]){
              if(leftMax < height[i]){
                leftMax = height[i];
             }
             else{
                trap += leftMax - height[i];
             }
             i++;
            }
            else{
                if(rightMax < height[j]){
                  rightMax = height[j];
                }
                else{
                  trap += rightMax - height[j];
                } 
                j--;  
            }   
        }
        return trap;
    }
}

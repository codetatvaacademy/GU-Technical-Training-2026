class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int rightMax = 0;
        int leftMax = 0;
        int count  =0 ;
        while(i <= j){
            if(height[i] < height[j]){
                if(height[i] < leftMax){
                    count += leftMax - height[i];
                }
                leftMax = Math.max(height[i] , leftMax);
                i++;
            }
            else{
                if(height[j] < rightMax){
                    count += rightMax - height[j];
                }
                rightMax = Math.max(height[j] , rightMax);
                j--;
            }
        }        
        return count;
    }
}

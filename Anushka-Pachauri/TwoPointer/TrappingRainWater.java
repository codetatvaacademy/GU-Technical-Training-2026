class TrappingRainWater {
    public int trap(int[] height) {
        int start=0;
        int end=height.length-1;
        int trap=0;
        int leftMax=0;
        int rightMax=0;
        while(start<end){
            if(height[end]>=height[start]){
                if(leftMax<height[start]){
                    leftMax=height[start];
                }
                else{
                    trap+=leftMax-height[start];
                }
                start++;
            }
            else{
                if(rightMax<height[end]){
                    rightMax=height[end];
                }
                else{
                    trap+=rightMax-height[end];
                }
                end--;
            }
        }
        return trap;
    }
}
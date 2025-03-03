class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int maxArea=0;
        while(start<end){
            if(height[end]>=height[start]){
                int area=height[start]*(end-start);
                maxArea=Math.max(maxArea,area);
                start++;
            }
            else{
                int area=height[end]*(end-start);
                maxArea=Math.max(maxArea,area);
                end--;
            }
        }
        return maxArea;
    }
}
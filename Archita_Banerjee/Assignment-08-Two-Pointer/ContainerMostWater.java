public class ContainerMostWater {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int maxArea=0;
        while(start< end){
            int currArea=Math.min(height[start], height[end]) * (end-start) ;
            maxArea= Math.max(currArea, maxArea);
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }
        return maxArea;

    }
}

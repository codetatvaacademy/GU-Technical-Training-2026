class Solution {
    public int maxArea(int[] height) {
        int j = height.length-1;
        int i = 0;
        int count = 0;

        while(i <= j){
            count = Math.max(count , Math.min(height[i], height[j]) * (j-i));
            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }

        }

        return count;
    }
}

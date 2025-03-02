class Solution {
    public int trap(int[] height) {
        int ptr1 = 0;
        int ptr2 = height.length-1;
        int lhigh = height[ptr1];
        int rhigh = height[ptr2];
        int water = 0;
        while(ptr1<ptr2){
            if(lhigh<rhigh){
                ptr1++;
                lhigh = lhigh>height[ptr1]?lhigh:height[ptr1];
                water += lhigh - height[ptr1];
            }
            else{
                ptr2--;
                rhigh = rhigh>height[ptr2]?rhigh:height[ptr2];
                water += rhigh - height[ptr2];
            }
        }
        return water;
    }
}
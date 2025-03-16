class Solution {
    public int maxArea(int[] height) {
        int ptr1 = 0;
        int ptr2 = height.length-1;
        int result = 0;
        while(ptr1!=ptr2){
            int low = height[ptr1]>=height[ptr2]?height[ptr2]:height[ptr1];
            int water = low*(ptr2-ptr1);
            result = water>result?water:result;
            while(ptr1<ptr2 && height[ptr1]<=low){
                ptr1++;
            }
            while(ptr1<ptr2 && height[ptr2]<=low){
                ptr2--;
            }
        }
        return result;
    }
}
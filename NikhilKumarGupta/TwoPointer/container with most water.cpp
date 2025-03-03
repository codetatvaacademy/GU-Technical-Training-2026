class Solution {
    public:
        int maxArea(vector<int>& height) {
            int n=height.size();
            int start=0;
            int end=n-1;
            int maxarea=INT_MIN;
            while(start<end){
                int width=end-start;
                int h=min(height[start],height[end]);
                int area=width*h;
                maxarea=max(maxarea,area);
                if(height[start]<height[end]){
                    start++;
                }
                else{
                end--;
                }
            }
    return maxarea;
        }
    };
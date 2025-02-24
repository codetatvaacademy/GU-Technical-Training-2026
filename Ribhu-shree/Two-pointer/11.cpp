class Solution {
    public:
    
        int maxArea(vector<int>& height) {
            int max_A= INT_MIN;
            int l =0 , h =height.size()-1;
            while(l<h){
                int curr = min(height[l],height[h]) * (h-l);
                if(curr>max_A){
                    max_A = curr;
                }
    
                if(height[l] < height[h]){
                    l++;
                }else if(height[l] >height[h]){
                    h--;
                }else{
                    l++;
                    h--;
                }
            }
            return max_A;
        }
    };
class Solution {
    public:
        int maxArea(int h, int w, vector<int>& horizontalCuts, vector<int>& verticalCuts) {
            sort(horizontalCuts.begin(),horizontalCuts.end());
            sort(verticalCuts.begin(),verticalCuts.end());
    
            int maxhori_diff = max(horizontalCuts[0], h - horizontalCuts.back());
            int maxverti_diff = max(verticalCuts[0], w - verticalCuts.back());
            for(int i =1 ;i<horizontalCuts.size();i++){
                if(horizontalCuts[i]-horizontalCuts[i-1]>maxhori_diff){
                    maxhori_diff=max(maxhori_diff, horizontalCuts[i] - horizontalCuts[i - 1]);
                }
            }
            for(int i =1 ;i<verticalCuts.size();i++){
                if(verticalCuts[i]-verticalCuts[i-1]>maxverti_diff){
                  maxverti_diff=  max(maxverti_diff, verticalCuts[i] - verticalCuts[i - 1]);
                }
            }
            long area = 1L * maxhori_diff*maxverti_diff;
            return area % 1000000007;
        }
    };
class Solution {
    public:
        int heightChecker(vector<int>& heights) {
           vector<int> expected(heights.size(),0);
           for(int i =0;i<heights.size();i++){
            expected[i]=heights[i];
           }
           sort(expected.begin(),expected.end());
           int count=0;
           for(int i =0;i<heights.size();i++){
                if(heights[i]!=expected[i]){
                    count++;
                }
           }
           return count;
        }
    };
class Solution {
    public:
        vector<vector<int>> intervalIntersection(vector<vector<int>>& firstList, vector<vector<int>>& secondList) {
            vector<vector<int>> answer;
            int i =0,j=0;
            while(i<firstList.size() && j < secondList.size()){
                int maxx = max(firstList[i][0],secondList[j][0]);
                int minn= min(firstList[i][1],secondList[j][1]);
                if(maxx<=minn){
                    answer.push_back({maxx,minn});
                }
                if(firstList[i][1]<secondList[j][1]){
                    i++;
                }else{
                    j++;
                }
    
            }
            return answer;
        }
    };
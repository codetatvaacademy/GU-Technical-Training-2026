class Solution {
    public:
        vector<vector<int>> intervalIntersection(vector<vector<int>>& firstList, vector<vector<int>>& secondList) {
            vector<vector<int>>ans;
    
            int n=firstList.size();
            int m=secondList.size();
    
            int i=0;
            int j=0;
            int maxi=0;
            int mini=0;
            while(i<n&&j<m){
                maxi=max(firstList[i][0],secondList[j][0]);
               mini=min(firstList[i][1],secondList[j][1]);
              
              if(maxi<=mini){
                ans.push_back({maxi,mini});
              }
    
               
                if(firstList[i][1]<secondList[j][1]){
                   i++;
                }
                else{
                    j++;
                }
    
            }
            return ans;
           
            
           
    
        }
    };
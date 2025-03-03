class Solution {
    public:
        
        static bool cmp(vector<int> a , vector<int> b){
            if(a[1] == b[1]) return a[0] < b[0];
            return a[1] < b[1];
        }
    
        vector<int> kWeakestRows(vector<vector<int>>& mat, int k) {
            //For storing indice and soldiers in a pair
            vector<vector<int>> pair ;
    
            int row = mat.size();
            int col = mat[0].size();
    
            for(int i=0;i<row;i++){
                int soldiers = 0;
                for(int j=0;j<col;j++){
                    if(mat[i][j]==0) break;
                    else soldiers++;
                }
                pair.push_back({i,soldiers});
            }
    
            sort(pair.begin(),pair.end(),cmp);
    
            vector<int> ans;
            for(int i = 0 ;i<k;i++){
                ans.push_back(pair[i][0]);
            }
    
            return ans;
            
        }
    };
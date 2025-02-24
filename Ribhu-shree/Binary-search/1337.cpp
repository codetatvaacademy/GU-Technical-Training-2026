class Solution {
    public:
        vector<int> kWeakestRows(vector<vector<int>>& mat, int k) {
            vector<pair<int, int>>no1s;
            vector<int>answer;
            for(int i = 0; i < mat.size(); i++){
                int count=0;
                for (int j = 0; j < mat[i].size(); j++) {
                if (mat[i][j] ==1) {
                    count++;
                } else {
                    break;  
                }
            }
            no1s.push_back({count, i});
            }
            sort(no1s.begin(),no1s.end());
            for(int i =0;i<k;i++){
                answer.push_back(no1s[i].second);
            }
            return answer;
        }
    };
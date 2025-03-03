class Solution {
    public:
        vector<int> diStringMatch(string s) {
            int n = s.size();
            vector<int> result;
    
            int I = 0;
            int D=n;
            for(int i = 0;i<n;i++){
    
                if(s[i]=='I'){
                    result.push_back(I);
                    I++;
                }else{
                    result.push_back(D);
                    D--;
                }
    
            }
            result.push_back(I);
            return result;
        }
    };
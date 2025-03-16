class Solution {
    public:
        int maxScore(string s) {
            int n=s.size();
            int ones=0;
            int zero=0;
            int maxi=INT_MIN;
    
            for(int i=0;i<n;i++){
                if(s[i]=='1'){
                    ones++;
                }
            }
            for(int i=0;i<n-1;i++){
                if(s[i]=='0'){
                    zero++;
                }
                else{
                    ones--;
                }
                maxi=max(maxi,ones+zero);
            }
            return maxi;
        }
    };
class Solution {
    public:
        int largestAltitude(vector<int>& gain) {
            int maxi=0;
            int n = gain.size();
            vector<int>prefix(n+1);
            prefix[0]=0;
           
            for(int i=1;i<=n;i++){
                prefix[i]=prefix[i-1]+gain[i-1];
                maxi=max(maxi,prefix[i]);
    
            }
            return maxi;
        }
    };
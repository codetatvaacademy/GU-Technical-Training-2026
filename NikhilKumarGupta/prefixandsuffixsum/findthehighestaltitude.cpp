class Solution {
    public:
        int largestAltitude(vector<int>& gain) {
            int maxi=0;
            int alti=0;
            int n=gain.size();
            for(int i=0;i<n;i++){
                alti=alti+gain[i];
                maxi=max(maxi,alti);
            }
            return maxi;
        }
    };
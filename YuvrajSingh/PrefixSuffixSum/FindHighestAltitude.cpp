class Solution {
    public:
        int largestAltitude(vector<int>& gain) {
            int n = gain.size();
            int maxi = INT_MIN;
            vector<int> ans(n+1);
            ans[0] = 0;
            for(int i=1;i<=n;i++){
                ans[i] = ans[i-1] + gain[i-1];
                maxi = max(ans[i],maxi);
            }
            if(maxi <0){
                return 0;
                }
            return maxi;
        }
    };
class Solution {
    public:
        int Wealth(vector<vector<int>>& accounts){
            int n = accounts.size();
            int maxi = INT_MIN;
            for(int i =0;i<n;i++)
            {
            int sum =0;
            for(int j =0 ; j<accounts[i].size(); j++){
                sum += accounts[i][j];
                maxi = max(maxi,sum);
            }
            }
            return maxi;
        }
        int maximumWealth(vector<vector<int>>& accounts) {
            return Wealth(accounts);
        }
    };
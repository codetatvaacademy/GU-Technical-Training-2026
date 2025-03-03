class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int maxwealth=0;
        int rowsize=accounts.size();
        for(int i=0;i<rowsize;i++){
            int colsize=accounts[i].size();
            int sum=0;
            for(int j=0;j<colsize;j++){
                sum+=accounts[i][j];
                if(maxwealth<sum){
                    maxwealth=sum;
                }
            }
        }
        return maxwealth;
        
    }
};

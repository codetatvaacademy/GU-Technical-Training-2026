class Solution {
    public:
        vector<vector<int>>presum;
        int solve(vector<vector<int>>&ans,int row1, int col1, int row2, int col2) {
            int sum=0;
            sum+=presum[row2][col2];
            if(col1>0) sum-=presum[row2][col1-1];
            if(row1>0) sum-=presum[row1-1][col2];
            if(col1>0 && row1>0) sum+=presum[row1-1][col1-1];
            return sum;
        }
        vector<vector<int>> matrixBlockSum(vector<vector<int>>& matrix, int k) {
            int m=matrix.size(),n=matrix[0].size();
            presum=matrix;
            for(int i=1;i<n;i++)
                presum[0][i]+=presum[0][i-1];
            for(int i=1;i<m;i++)
                presum[i][0]+=presum[i-1][0];
            for(int i=1;i<m;i++){
                for(int j=1;j<n;j++){
                    presum[i][j]+=presum[i-1][j]+presum[i][j-1]-presum[i-1][j-1];
                }
            }
            vector<vector<int>>ans(m,vector<int>(n,0));
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    ans[i][j]=solve(ans,(i<k)?0:i-k,(j<k)?0:j-k,(i+k)>=m?m-1:i+k,(j+k)>=n?n-1:j+k);
                }
            }
            return ans;
        }
    };
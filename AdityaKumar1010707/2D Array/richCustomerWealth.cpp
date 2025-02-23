#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int m = accounts.size();
        int n = accounts[0].size();
        int maxi = INT_MIN;

        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += accounts[i][j];
            }
            maxi = max(maxi, sum);
        }

        return maxi;
    }
};

int main() {
    Solution sol;
    
    vector<vector<int>> accounts = {
        {1, 2, 3},
        {3, 2, 1},
        {5, 1, 2}
    };

    cout << "Maximum Wealth: " << sol.maximumWealth(accounts) << endl;
    
    return 0;
}

#include <iostream>
#include <vector>
#include <algorithm>
#include <climits> // For INT_MIN

using namespace std;

class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int n = accounts.size();  
        int m = accounts[0].size(); 
        int maxSum = INT_MIN;  
        
        for (int i = 0; i < n; i++) {
            int sum = 0;  
            for (int j = 0; j < m; j++) {
                sum += accounts[i][j];  
            }
            maxSum = max(maxSum, sum);  
        }
        return maxSum;
    }
};

int main() {
    Solution sol;
    
    // Test case 1
    vector<vector<int>> accounts1 = {
        {1, 2, 3},
        {3, 2, 1},
        {4, 5, 6}
    };
    cout << "Maximum wealth (Test Case 1): " << sol.maximumWealth(accounts1) << endl; // Output: 15

    // Test case 2
    vector<vector<int>> accounts2 = {
        {10, 20},
        {5, 10},
        {50, 30}
    };
    cout << "Maximum wealth (Test Case 2): " << sol.maximumWealth(accounts2) << endl; // Output: 80

    // Test case 3
    vector<vector<int>> accounts3 = {
        {7, 1, 3},
        {2, 8, 1},
        {3, 3, 9}
    };
    cout << "Maximum wealth (Test Case 3): " << sol.maximumWealth(accounts3) << endl; // Output: 15

    return 0;
}

#include <iostream>
#include <vector>
#include <climits>
using namespace std;

class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int n = accounts.size();
        int m = accounts[0].size();
        int maxSum = INT_MIN;
        
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = 0; j < m; j++) {
                sum += accounts[i][j];
            }
            maxSum = max(maxSum, sum);
        }
        return maxSum;
    }
};

int main() {
    int n, m;
    cout << "Enter the number of customers: ";
    cin >> n;
    cout << "Enter the number of accounts each customer has: ";
    cin >> m;
    
    vector<vector<int>> accounts(n, vector<int>(m));
    
    cout << "Enter the wealth for each customer in each account: \n";
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            cin >> accounts[i][j];
        }
    }
    
    Solution solution;
    int result = solution.maximumWealth(accounts);
    
    cout << "The maximum wealth is: " << result << endl;
    
    return 0;
}

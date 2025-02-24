#include <iostream>
#include <vector>
#include <climits>
using namespace std;

class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        int cp = INT_MAX;
        int op = 0;
        int profit = 0;
        for (int i = 0; i < n; i++) {
            if (prices[i] < cp) 
                cp = prices[i];

            profit = prices[i] - cp;
            if (op < profit) 
                op = profit;
        }
        return op;
    }
};

int main() {
    Solution solution;
    int n;
    cout << "Enter the number of days: ";
    cin >> n;
    vector<int> prices(n);
    cout << "Enter the prices: ";
    for (int i = 0; i < n; i++) {
        cin >> prices[i];
    }
    cout << "Maximum profit: " << solution.maxProfit(prices) << endl;
    return 0;
}

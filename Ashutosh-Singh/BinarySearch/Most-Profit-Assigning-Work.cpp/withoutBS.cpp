#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    int maxProfitAssignment(vector<int>& difficulty, vector<int>& profit, vector<int>& worker) {
        int n = difficulty.size();
        int m = worker.size();

        vector<pair<int, int>> jobs(n);
        for (int i = 0; i < n; ++i) {
            jobs[i] = {difficulty[i], profit[i]};
        }
        sort(jobs.begin(), jobs.end());  
        sort(worker.begin(), worker.end()); 

        int maxProfit = 0; 
        int bestProfit = 0; 
        int j = 0;     

        for (int ability : worker) {
            while (j < n && jobs[j].first <= ability) {
                bestProfit = max(bestProfit, jobs[j].second);
                ++j;
            }
            maxProfit += bestProfit;
        }

        return maxProfit;
    }
};

int main() {
    
    vector<int> difficulty = {2, 4, 6, 8, 10};
    vector<int> profit = {10, 20, 30, 40, 50};
    vector<int> worker = {4, 5, 6, 7};

    Solution solution;
    int result = solution.maxProfitAssignment(difficulty, profit, worker);

    cout << "Maximum Profit: " << result << endl;

    return 0;
}

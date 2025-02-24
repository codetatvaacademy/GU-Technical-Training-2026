#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    int binarySearch(int ability, vector<pair<int, int>>& job, int size) {
        int start = 0;
        int end = size - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (job[mid].first <= ability) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end;
    }

    int maxProfitAssignment(vector<int>& difficulty, vector<int>& profit, vector<int>& worker) {
        int maxProfit = 0;
        int n = difficulty.size();
        vector<pair<int, int>> job(n);

        // Combine difficulty and profit into pairs
        for (int i = 0; i < n; i++) {
            job[i] = {difficulty[i], profit[i]};
        }

        // Sort jobs by difficulty, and resolve ties with higher profit
        sort(job.begin(), job.end());

        // Update profit to be the maximum up to that point
        for (int i = 1; i < n; i++) {
            job[i].second = max(job[i].second, job[i - 1].second);
        }

        // Calculate the maximum profit for each worker
        for (int ability : worker) {
            int index = binarySearch(ability, job, n);
            maxProfit += index == -1 ? 0 : job[index].second;
        }

        return maxProfit;
    }
};

int main() {
    int n, m; // Number of jobs and workers
    cout << "Enter the number of jobs: ";
    cin >> n;
    vector<int> difficulty(n), profit(n);

    cout << "Enter the difficulty of each job: ";
    for (int i = 0; i < n; i++) {
        cin >> difficulty[i];
    }

    cout << "Enter the profit of each job: ";
    for (int i = 0; i < n; i++) {
        cin >> profit[i];
    }

    cout << "Enter the number of workers: ";
    cin >> m;
    vector<int> worker(m);

    cout << "Enter the ability of each worker: ";
    for (int i = 0; i < m; i++) {
        cin >> worker[i];
    }

    Solution solution;
    int result = solution.maxProfitAssignment(difficulty, profit, worker);

    cout << "The maximum profit that can be assigned is: " << result << endl;

    return 0;
}

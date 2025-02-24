#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    int minimumSize(vector<int>& nums, int maxOperations) {
        int start = 1, end = *max_element(nums.begin(), nums.end());
        int minPenalty = end;

        // Binary search on possible penalty range
        while (start <= end) {
            int penalty = start + (end - start) / 2;
            if (isPossible(nums, maxOperations, penalty)) {
                minPenalty = penalty;
                end = penalty - 1;
            } else {
                start = penalty + 1;
            }
        }

        return minPenalty;
    }

private:
    bool isPossible(vector<int>& nums, int maxOperations, int penalty) {
        int requiredOps = 0;
        for (int n : nums) {
            int x = n / penalty;
            if (n % penalty == 0) x--; // Avoid overestimating operations for exact divisions
            requiredOps += x;
            if (requiredOps > maxOperations) return false; // Early exit if operations exceed the limit
        }
        return requiredOps <= maxOperations;
    }
};

int main() {
    Solution solution;
    vector<int> nums = {9, 6, 7, 11}; // Example input
    int maxOperations = 5;           // Example maximum operations

    int result = solution.minimumSize(nums, maxOperations);
    cout << "Minimum Penalty: " << result << endl;

    return 0;
}

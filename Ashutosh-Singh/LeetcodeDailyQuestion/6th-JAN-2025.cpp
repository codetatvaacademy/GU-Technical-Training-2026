#include <iostream>
#include <vector>
#include <string>
#include <cmath>

using namespace std;
//Can be optimized to O(n)
class Solution {
public:
    vector<int> minOperations(string boxes) {
        int n = boxes.size();
        vector<int> oneIndices;
        vector<int> ans;

        for (int i = 0; i < n; i++) {
            if (boxes[i] == '1') {
                oneIndices.push_back(i);
            }
        }

        for (int i = 0; i < n; i++) {
            int opSum = 0;
            for (auto& idx : oneIndices) {
                opSum += abs(i - idx);
            }
            ans.push_back(opSum);
        }

        return ans;
    }
};

int main() {

    string boxes;
    cout << "Enter the string of boxes (only 0s and 1s): ";
    cin >> boxes;

    Solution solution;

    vector<int> result = solution.minOperations(boxes);

    cout << "Minimum operations for each box: ";
    for (int operations : result) {
        cout << operations << " ";
    }
    cout << endl;

    return 0;
}

#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Solution {
public:
    int maxScore(string s) {
        int n = s.size();
        vector<int> zeros(n);
        vector<int> ones(n);

        // Prefix sum for zeros
        if (s[0] == '0') {
            zeros[0] = 1;
        }
        for (int i = 1; i < n; i++) {
            zeros[i] = zeros[i - 1] + (s[i] == '0');
        }

        // Prefix sum for ones
        if (s[n - 1] == '1') {
            ones[n - 1] = 1;
        }
        for (int i = n - 2; i >= 0; i--) {
            ones[i] = ones[i + 1] + (s[i] == '1');
        }

        // Max score calculation
        int maxCnt = 0;
        for (int i = 0; i < n - 1; i++) {
            int diff = zeros[i] + ones[i + 1];
            maxCnt = max(maxCnt, diff);
        }

        return maxCnt;
    }
};

int main() {
    Solution solution;
    string input;

    cout << "Enter the binary string: ";
    cin >> input;

    int result = solution.maxScore(input);
    cout << "Maximum score: " << result << endl;

    return 0;
}

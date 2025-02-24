#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Solution {
public:
    int maxScore(string s) {
        int n = s.size();
        vector<int> zeros(n);
        vector<int> ones(n);

        if (s[0] == '0') {
            zeros[0] = 1;
        }
        for (int i = 1; i < n; i++) {
            zeros[i] = zeros[i - 1] + (s[i] == '0');
        }

        if (s[n - 1] == '1') {
            ones[n - 1] = 1;
        }
        for (int i = n - 2; i >= 0; i--) {
            ones[i] = ones[i + 1] + (s[i] == '1');
        }

        int maxCnt = 0;
        for (int i = 0; i < n - 1; i++) {
            int diff = zeros[i] + ones[i + 1];
            maxCnt = max(maxCnt, diff);
        }

        return maxCnt;
    }
};

int main() {
    string s = "011101";

    Solution solution;
    int result = solution.maxScore(s);
    cout << "Maximum score for string \"" << s << "\": " << result << endl;

    return 0;
}

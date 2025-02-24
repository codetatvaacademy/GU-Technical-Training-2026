#include <iostream>
#include <string>
#include <cmath> 
#include <algorithm> 
using namespace std;

class Solution {
public:
    int equalSubstring(string s, string t, int maxCost) {
        int currCost = 0;
        int l = 0;
        int res = 0;

        for (int r = 0; r < s.size(); r++) {
            currCost += abs(s[r] - t[r]);

            while (currCost > maxCost) {
                currCost -= abs(s[l] - t[l]);
                l++;
            }

            res = max(res, r - l + 1);
        }
        return res;
    }
};

int main() {
    Solution solution;
    string s, t;
    int maxCost;

    cout << "Enter the first string: ";
    cin >> s;
    cout << "Enter the second string: ";
    cin >> t;
    cout << "Enter the maximum cost: ";
    cin >> maxCost;

    int result = solution.equalSubstring(s, t, maxCost);
    cout << "The maximum length of a substring with cost <= maxCost is: " << result << endl;

    return 0;
}

#include <iostream>
#include <string>
#include <vector>
#include <climits>
using namespace std;

class Solution {
public:
    string minWindow(string s, string t) {
        vector<int> hash(256, 0);
        for (int i = 0; i < t.size(); i++) {
            hash[t[i]]++;
        }

        int left = 0, right = 0, minLength = INT_MAX, stIndex = -1, cnt = 0;

        while (right < s.size()) {
            if (hash[s[right]] > 0)
                cnt++;
            hash[s[right]]--;

            while (cnt == t.size()) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    stIndex = left;
                }
                hash[s[left]]++;
                if (hash[s[left]] > 0)
                    cnt--;
                left++;
            }
            right++;
        }

        return (stIndex == -1) ? "" : s.substr(stIndex, minLength);
    }
};

int main() {
    string s, t;
    cin >> s >> t;

    Solution solution;
    string result = solution.minWindow(s, t);

    cout << result << endl;

    return 0;
}

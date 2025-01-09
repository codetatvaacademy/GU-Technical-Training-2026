#include <iostream>
#include <vector>
#include <string>

using namespace std;

class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        vector<int> result;
        if (s.size() < p.size()) return result;

        vector<int> freqP(26, 0), freqWindow(26, 0);
        int pLen = p.size();

        for (char c : p) {
            freqP[c - 'a']++;
        }

        for (int i = 0; i < s.size(); i++) {
            freqWindow[s[i] - 'a']++;

            if (i >= pLen) {
                freqWindow[s[i - pLen] - 'a']--;
            }

            if (freqWindow == freqP) {
                result.push_back(i - pLen + 1);
            }
        }

        return result;
    }
};

int main() {
    Solution solution;
    string s = "cbaebabacd";
    string p = "abc";

    vector<int> result = solution.findAnagrams(s, p);

    cout << "Anagram indices: ";
    for (int index : result) {
        cout << index << " ";
    }
    cout << endl;

    return 0;
}

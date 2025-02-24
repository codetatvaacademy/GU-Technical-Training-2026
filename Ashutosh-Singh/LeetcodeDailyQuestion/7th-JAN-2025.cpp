#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Solution {
public:
    vector<string> stringMatching(vector<string>& words) {
        vector<string> ans;
        for (auto i : words) {
            for (auto j : words) {
                if (i == j) continue;
                if (j.find(i) != string::npos) {
                    ans.push_back(i);
                    break;
                }
            }
        }
        return ans;
    }
};

int main() {
    int n;
    cout << "Enter the number of words: ";
    cin >> n;

    vector<string> words(n);
    cout << "Enter the words: " << endl;
    for (int i = 0; i < n; i++) {
        cin >> words[i];
    }

    Solution solution;
    vector<string> result = solution.stringMatching(words);

    cout << "Words that are substrings of other words: " << endl;
    for (const auto& word : result) {
        cout << word << endl;
    }

    return 0;
}

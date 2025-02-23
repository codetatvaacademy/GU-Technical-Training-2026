#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Solution {
public:
    bool check(char c) { 
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    vector<int> vowelStrings(vector<string>& words, vector<vector<int>>& queries) {
        vector<int> v, ans;
        v.push_back(0);
        for (auto w : words) { 
            if (check(w[0]) && check(w.back())) 
                v.push_back(v.back() + 1);  
            else 
                v.push_back(v.back());
        }
        for (auto q : queries) 
            ans.push_back(v[q[1] + 1] - v[q[0]]);
        return ans;
    }
};

int main() {
    Solution solution;
    int n, m;

    cout << "Enter number of words: ";
    cin >> n;
    vector<string> words(n);

    cout << "Enter words: \n";
    for (int i = 0; i < n; ++i) {
        cin >> words[i];
    }

    cout << "Enter number of queries: ";
    cin >> m;
    vector<vector<int>> queries(m, vector<int>(2));

    cout << "Enter queries (start and end indices): \n";
    for (int i = 0; i < m; ++i) {
        cin >> queries[i][0] >> queries[i][1];
    }

    vector<int> result = solution.vowelStrings(words, queries);

    cout << "Results: \n";
    for (int res : result) {
        cout << res << endl;
    }

    return 0;
}

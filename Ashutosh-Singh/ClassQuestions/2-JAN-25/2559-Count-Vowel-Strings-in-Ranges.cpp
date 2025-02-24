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

    vector<string> words = {"apple", "orange", "idea", "umbrella", "owl"};
    vector<vector<int>> queries = {{0, 2}, {1, 4}, {0, 4}};

    Solution solution;
    vector<int> result = solution.vowelStrings(words, queries);
    cout << "Results for the queries: " << endl;
    for (int res : result) {
        cout << res << endl;
    }

    return 0;
}

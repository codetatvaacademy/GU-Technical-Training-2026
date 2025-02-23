#include <iostream>
#include <string>
#include <algorithm> 
using namespace std;

class Solution {
public:
    int numberOfSubstrings(string s) {
        int last[3] = {-1, -1, -1}, res = 0, n = s.length();
        for (int i = 0; i < n; ++i) {
            last[s[i] - 'a'] = i; 
            res += 1 + min({last[0], last[1], last[2]}); 
        }
        return res;
    }
};

int main() {
    Solution solution;
    string s;
    cout << "Enter a string containing only 'a', 'b', and 'c': ";
    cin >> s;

    int result = solution.numberOfSubstrings(s);
    cout << "The number of substrings containing all three characters is: " << result << endl;

    return 0;
}

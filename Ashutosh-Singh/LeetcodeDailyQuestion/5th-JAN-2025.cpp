#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Solution {
public:
    string shiftingLetters(string s, vector<vector<int>>& shifts) {
        int n = s.size();
        vector<int> diff(n + 1, 0);
        for (auto& shift : shifts) {
            diff[shift[0]] += (shift[2] == 1) ? 1 : -1;
            diff[shift[1] + 1] += (shift[2] == 1) ? -1 : 1;
        }

        int shiftSum = 0;
        for (int i = 0; i < n; i++) {
            shiftSum = (shiftSum + diff[i]) % 26;
            if (shiftSum < 0) shiftSum += 26;
            s[i] = 'a' + (s[i] - 'a' + shiftSum) % 26;
        }
        return s;
    }
};

int main() {
    Solution solution;

    // Example input
    string s = "abc";
    vector<vector<int>> shifts = {
        {0, 1, 1},  // Shift letters from index 0 to 1 forward
        {1, 2, 0}   // Shift letters from index 1 to 2 backward
    };

    // Call the function
    string result = solution.shiftingLetters(s, shifts);

    // Print the result
    cout << "Resultant string: " << result << endl; // Output depends on the shifts applied

    return 0;
}

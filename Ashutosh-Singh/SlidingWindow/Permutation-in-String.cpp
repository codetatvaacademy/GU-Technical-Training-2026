#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        int n = s1.size();
        int m = s2.size();

        if (n > m) return false;

        vector<int> freq1(26, 0);
        vector<int> freq2(26, 0);
        for (int i = 0; i < n; i++) {
            freq1[s1[i] - 'a']++;
        }

        for (int i = 0; i < n; i++) {
            freq2[s2[i] - 'a']++;
        }

        if (freq1 == freq2) return true;

        for (int i = n; i < m; i++) {
            freq2[s2[i] - 'a']++;          
            freq2[s2[i - n] - 'a']--;         

            if (freq1 == freq2) return true;  
        }

        return false;
    }
};

int main() {
    Solution solution;
    string s1, s2;

    cout << "Enter the first string (s1): ";
    cin >> s1;

    cout << "Enter the second string (s2): ";
    cin >> s2;

    if (solution.checkInclusion(s1, s2)) {
        cout << "s1 is a permutation of a substring of s2" << endl;
    } else {
        cout << "s1 is NOT a permutation of a substring of s2" << endl;
    }

    return 0;
}

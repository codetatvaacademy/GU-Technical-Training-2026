#include <iostream>
#include <string>
#include <climits>
using namespace std;

class Solution {
public:
    bool isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    int maxVowels(string s, int k) {
        int n = s.size();
        int vowelCnt = 0;
        int maxCnt = INT_MIN;

        // Count vowels in the first window
        for (int i = 0; i < k; i++) {
            if (isVowel(s[i])) {
                vowelCnt++;
            }
        }
        maxCnt = max(maxCnt, vowelCnt);

        int left = 0;
        int right = k;

        // Slide the window across the string
        while (right < n) {
            if (isVowel(s[right])) {
                vowelCnt++;
            }
            if (isVowel(s[left])) {
                vowelCnt--;
            }

            maxCnt = max(maxCnt, vowelCnt);
            left++;
            right++;
        }

        return maxCnt;
    }
};

int main() {
    Solution solution;
    string s;
    int k;

    cout << "Enter the string: ";
    cin >> s;

    cout << "Enter the size of the window (k): ";
    cin >> k;

    int result = solution.maxVowels(s, k);

    cout << "The maximum number of vowels in any substring of length " << k << " is: " << result << endl;

    return 0;
}

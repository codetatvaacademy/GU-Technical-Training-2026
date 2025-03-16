#include <iostream>
#include <string>
#include <cmath> // for abs
#include <algorithm> // for max
using namespace std;

int equalSubstring(string s, string t, int maxCost) {
    int n = s.length();

    int maxLen = 0;
    int currCost = 0;

    int start = 0, end = 0;
    while (end < n) {
        currCost += abs(s[end] - t[end]);

        while (currCost > maxCost) {
            currCost -= abs(s[start] - t[start]);
            start++;
        }

        maxLen = max(maxLen, end - start + 1);
        end++;
    }

    return maxLen;
}

int main() {
    string s, t;
    int maxCost;

    // Taking inputs from the user
    cout << "Enter the first string (s): ";
    cin >> s;
    cout << "Enter the second string (t): ";
    cin >> t;
    cout << "Enter the maximum cost: ";
    cin >> maxCost;

    // Calling the function
    int result = equalSubstring(s, t, maxCost);

    // Output the result
    cout << "The length of the longest substring is: " << result << endl;

    return 0;
}

#include <iostream>
#include <vector>

using namespace std;

// Function to find the length of the longest substring without repeating characters
int lengthOfLongestSubstring(string s) {
    vector<int> lastIndex(256, -1); // Stores last index of each character (ASCII 0-255)
    
    int left = 0, maxLength = 0; // Left pointer and max length of substring

    for (int right = 0; right < s.length(); right++) {
        if (lastIndex[s[right]] != -1) {
            left = max(left, lastIndex[s[right]] + 1);
        }

        lastIndex[s[right]] = right; // Update last occurrence index
        maxLength = max(maxLength, right - left + 1); // Update max length
    }

    return maxLength;
}

int main() {
    string s;
    cout << "Enter a string: ";
    cin >> s;

    int result = lengthOfLongestSubstring(s);
    cout << "Length of the longest substring without repeating characters: " << result << endl;

    return 0;
}

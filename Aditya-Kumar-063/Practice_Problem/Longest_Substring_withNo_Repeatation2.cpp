#include <iostream>
#include <vector>
#include <string>
#include <algorithm> // for max function
using namespace std;

// Function to find the length of the longest substring without repeating characters
int lengthofLongestSubstring(string s) {
    // Create a vector to store the last index of each character (ASCII range 0-255)
    vector<int> mpp(256, -1);

    int left = 0, right = 0; // Two pointers for the sliding window
    int n = s.size(); // Length of the input string
    int len = 0; // Variable to store the maximum length of the substring

    // Traverse the string using the right pointer
    while (right < n) {
        // If the character is already in the substring, move the left pointer
        // to the right of the last occurrence of the current character
        if (mpp[s[right]] != -1)
            left = max(mpp[s[right]] + 1, left);

        // Update the last index of the current character
        mpp[s[right]] = right;

        // Calculate the length of the current substring and update the maximum length
        len = max(len, right - left + 1);

        // Move the right pointer to the next character
        right++;
    }

    // Return the maximum length of the substring without repeating characters
    return len;
}

int main() {
    string str;

    // Taking input from the user
    cout << "Enter the string: ";
    cin >> str;

    // Output the result
    cout << "The length of the longest substring without repeating characters is: " 
         << lengthofLongestSubstring(str) << endl;

    return 0;
}

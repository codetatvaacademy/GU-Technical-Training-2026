#include <iostream>
#include <string>
#include <vector>
using namespace std;

// Function to check if all elements in the count vector are zero
bool allZero(vector<int>& count) {
    return count == vector<int>(26, 0);
}

// Function to count the occurrences of anagrams of 'pat' in 'txt'
int search(string pat, string txt) {
    int k = pat.size();
    vector<int> count(26, 0);

    // Populate the count vector with the frequency of characters in 'pat'
    for (char &ch : pat) {
        count[ch - 'a']++;
    }

    int i = 0, j = 0;
    int n = txt.size();
    int result = 0;

    while (j < n) {
        int idx = txt[j] - 'a';
        count[idx]--;

        // Check if the window size matches the size of the pattern
        if (j - i + 1 == k) {
            if (allZero(count)) {
                result++;
            }

            // Slide the window: restore the count of the outgoing character
            count[txt[i] - 'a']++;
            i++;
        }
        j++;
    }

    return result;
}

int main() {
    string txt, pat;

    // Input: Text string
    cout << "Enter the text: ";
    cin >> txt;

    // Input: Pattern string
    cout << "Enter the pattern: ";
    cin >> pat;

    // Count the occurrences of anagrams
    int result = search(pat, txt);

    // Output the result
    cout << "Number of anagrams of the pattern in the text: " << result << endl;

    return 0;
}

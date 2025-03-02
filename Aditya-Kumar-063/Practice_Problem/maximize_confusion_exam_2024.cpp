#include <iostream>
#include <unordered_map>
#include <string>
#include <algorithm>

using namespace std;

// Function to find the maximum number of consecutive answers after flipping at most 'k' characters
int maxConsecutiveAnswers(string answerKey, int k) {
    int result = k;
    unordered_map<char, int> mp;
    int i = 0;

    for (int j = 0; j < answerKey.length(); j++) {
        mp[answerKey[j]]++;

        // If the minimum count between 'T' and 'F' exceeds k, move the window
        while (min(mp['T'], mp['F']) > k) {
            mp[answerKey[i]]--;
            i++;
        }

        // Update the maximum length of consecutive answers
        result = max(result, j - i + 1);
    }

    return result;
}

int main() {
    string answerKey;
    int k;

    // Taking input from the user
    cout << "Enter the answer key string (T/F only): ";
    cin >> answerKey;

    cout << "Enter the maximum number of flips allowed (k): ";
    cin >> k;

    // Compute and display the result
    int maxLength = maxConsecutiveAnswers(answerKey, k);
    cout << "Maximum consecutive answers possible: " << maxLength << endl;

    return 0;
}

#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

// Function to calculate max consecutive answers after flipping
int maxConsecutiveAnswers(string answerKey, int k) {
    int n = answerKey.length();
    int result = 0;

    // First pass: Flipping 'F' -> 'T'
    int i = 0, j = 0, countF = 0;
    while (j < n) {
        if (answerKey[j] == 'F')
            countF++;

        while (countF > k) {
            if (answerKey[i] == 'F')
                countF--;
            i++;
        }

        result = max(result, j - i + 1);
        j++;
    }

    // Second pass: Flipping 'T' -> 'F'
    i = 0, j = 0;
    int countT = 0;
    while (j < n) {
        if (answerKey[j] == 'T')
            countT++;

        while (countT > k) {
            if (answerKey[i] == 'T')
                countT--;
            i++;
        }

        result = max(result, j - i + 1);
        j++;
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

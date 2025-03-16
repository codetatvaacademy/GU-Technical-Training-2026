#include <iostream>
#include <vector>
#include <algorithm> // For max function
using namespace std;

// Function to calculate the maximum score
int maxScore(vector<int>& cardPoints, int k) {
    int n = cardPoints.size(); // Total number of cards
    int leftSum = 0, rightSum = 0, maxSum = 0;

    // Calculate the initial sum of the first 'k' cards from the left
    for (int i = 0; i < k; i++) {
        leftSum += cardPoints[i];
        maxSum = leftSum; // Initialize maxSum as leftSum
    }

    // Use a sliding window approach to include cards from the right
    int rightIndex = n - 1; // Start index for right side
    for (int i = k - 1; i >= 0; i--) {
        leftSum -= cardPoints[i];      // Remove the current left card
        rightSum += cardPoints[rightIndex]; // Add the current right card
        rightIndex--; // Move the right index to the left
        maxSum = max(maxSum, leftSum + rightSum); // Update maxSum if the new sum is larger
    }

    return maxSum; // Return the maximum score
}

// Main function for user input
int main() {
    int n, k;

    // Taking input for the size of the array
    cout << "Enter the number of cards: ";
    cin >> n;

    vector<int> cardPoints(n); // Create a vector of size n

    // Taking input for the card points
    cout << "Enter the card points: ";
    for (int i = 0; i < n; i++) {
        cin >> cardPoints[i];
    }

    // Taking input for the value of k
    cout << "Enter the value of k: ";
    cin >> k;

    // Call the function and display the result
    int result = maxScore(cardPoints, k);
    cout << "The maximum score you can achieve is: " << result << endl;

    return 0;
}

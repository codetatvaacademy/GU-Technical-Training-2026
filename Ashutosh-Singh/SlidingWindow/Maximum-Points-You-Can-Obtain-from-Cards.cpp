#include <iostream>
#include <vector>
#include <algorithm> // for std::max
using namespace std;

class Solution {
public:
    int maxScore(vector<int>& cardPoints, int k) {
        int n = cardPoints.size(), sum = 0, mx = 0;

        // Find sum of first 'k' elements in input
        for (int i = 0; i < k; i++) {
            mx += cardPoints[i];
        }

        sum = mx;

        // Sliding window to include elements from the end and exclude from the start
        for (int i = 0; i < k; i++) {
            sum = sum + cardPoints[n - i - 1] - cardPoints[k - i - 1];
            mx = max(mx, sum);
        }

        // cardPoints = [100,40,17,9,73,75], k = 3 ; n = 6 ; sum = 157 [100 + 40 + 17 ] ; max = 157
        // i   n-i-1   k-i-1 (sum + cardPoints[n-i-1] - cardPoints[k-i-1])   sum      max
        // 0   5       2      215  [157 + 75 - 17]                           215      215
        // 1   4       1      248  [215 + 73 - 40]                           248      248
        // 2   3       0      157  [248 + 9 - 100]                           157      248

        return mx;
    }
};

int main() {
    Solution solution;
    int n, k;

    cout << "Enter the number of cards: ";
    cin >> n;

    vector<int> cardPoints(n);
    cout << "Enter the card points: ";
    for (int i = 0; i < n; i++) {
        cin >> cardPoints[i];
    }

    cout << "Enter the number of cards to pick (k): ";
    cin >> k;

    int result = solution.maxScore(cardPoints, k);
    cout << "The maximum score you can achieve is: " << result << endl;

    return 0;
}

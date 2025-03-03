class Solution {
public:
    int maxScore(std::vector<int>& cardPoints, int k) {
        int n = cardPoints.size();
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += cardPoints[i];
        }
        if (k == n) {
            return totalSum;
        }
        int windowSum = 0, minWindowSum = INT_MAX;
        for (int i = 0; i < n; i++) {
            windowSum += cardPoints[i];
            if (i >= n - k - 1) {
                minWindowSum = min(minWindowSum, windowSum);
                windowSum -= cardPoints[i - (n - k - 1)];
            }
        }
        return totalSum - minWindowSum;
    }
};
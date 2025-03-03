class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalPoints = 0;
        for (int i = 0; i < k; i++) {
            totalPoints += cardPoints[i];
        }//first k cards
        int maxPoints = totalPoints;
        for (int i = 0; i < k; i++) {
            totalPoints = totalPoints - cardPoints[k - 1 - i] + cardPoints[n - 1 - i];
            maxPoints = Math.max(maxPoints, totalPoints);
        }
        return maxPoints;
    }
}
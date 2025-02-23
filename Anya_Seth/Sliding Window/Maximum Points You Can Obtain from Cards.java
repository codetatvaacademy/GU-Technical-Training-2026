class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int i = k - 1;
        int j = cardPoints.length - 1;
        int score = 0;
        for(int z = 0 ; z < k ; z++){
            score += cardPoints[z];
        }
        int maxScore = score;
        while(i >= 0){
            score += cardPoints[j];
            score -= cardPoints[i];
            maxScore = Math.max(maxScore, score);
            i--;
            j--;
        }
        return maxScore;
    }
}

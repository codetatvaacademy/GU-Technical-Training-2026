class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int score=0;
        for(int i=0;i<k;i++){
            score+=cardPoints[i];
        }
        int maxScore=score;
        for(int i=1;i<=k;i++){
            score-=cardPoints[k-i];
            score+=cardPoints[cardPoints.length-i];
            maxScore=Math.max(maxScore,score);
        }
        return maxScore;
    }
}
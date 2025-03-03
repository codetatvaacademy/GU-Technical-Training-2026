public class MaxPointsCards {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int lsum=0;
        int rsum=0;
        for(int i=0;i<k;i++){
            lsum += cardPoints[i];
        }
        int maxScore= lsum;
        int rIndex=n-1;
        for(int i=k-1;i>=0;i--){
            lsum -= cardPoints[i];
            rsum += cardPoints[rIndex];
            rIndex--;
            maxScore= Math.max(maxScore, lsum + rsum);
        }
        return maxScore;
    }
}

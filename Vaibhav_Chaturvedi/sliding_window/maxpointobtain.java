package sliding_window;
 
class maxpointobtain{
    public int maxScore(int[] cardPoints, int k) {
        int score = 0;
        for(int i = 0; i < k; i++){
            score += cardPoints[i]; 
        }
        int maxS = score;

        for(int i = cardPoints.length - 1 ; i >= 0; i--) {
            k--;
            if(k < 0){
                break;
            }
            score += cardPoints[i] - cardPoints[k];
            maxS = Math.max( maxS, score);
            
        } 
        return maxS;
    }
} 

import java.util.Arrays;

public class BagTokens {
    public int bagOfTokensScore(int[] tokens, int power) {
        int maxScore=0;
        int score=0;
        Arrays.sort(tokens);
        int i=0;
        int j=tokens.length-1;
        while(i<=j){
            if(tokens[i]<=power){
                score++;
                power-=tokens[i];
                i++;
                maxScore= Math.max(score, maxScore);
            }else if(score>0){
                power+=tokens[j];
                score-=1;
                j--;
            }else{
                return 0;
            }

        }
        return maxScore;
    }
}

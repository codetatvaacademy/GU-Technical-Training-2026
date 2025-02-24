import java.util.*;

public class BagofTokens {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int start = 0;
        int end = tokens.length - 1;
        int maxScore = 0;
        int score = 0;
        if(tokens.length != 0 && tokens[0] > power ){
            return 0;
        }

        while(start <= end){
            if(power >= tokens[start]){
                score +=1;
                power = power - tokens[start];
                start++;
            }else{
                
                power = power + tokens[end];
                score -= 1;                
                end--;
            }
            maxScore = Math.max(maxScore,score);
        }
        return maxScore;
    }
    public static void main(String[] args) {
        BagofTokens obj = new BagofTokens();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] tokens = new int[n];

        for(int i = 0; i < n; i++){
            tokens[i] = sc.nextInt();
        }

        int power = sc.nextInt();

        int maxScore = obj.bagOfTokensScore(tokens, power);

        System.out.println(maxScore);
        sc.close();
    }
}

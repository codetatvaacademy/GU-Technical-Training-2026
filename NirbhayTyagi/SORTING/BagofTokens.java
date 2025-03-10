import java.util.Arrays;
import java.util.Scanner;

class BagofTokens{
    public static int bagOfTokensScore(int[] tokens, int power) {
        int start = 0;
        int end = tokens.length-1;
        int score = 0;
        int maxScore = 0;
        Arrays.sort(tokens);

        while(start<=end){
            if(tokens[start] <= power){
                power -= tokens[start];
                score++;
                start++;
                maxScore = Math.max(score,maxScore);
            }
            else if(score > 0){
                power += tokens[end];
                score--;

                end--;
            }
            else{
                break;
            }
        }
        return maxScore;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array:");
        int n = sc.nextInt();
        int[] tokens = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            tokens[i] = sc.nextInt();            
        }
        System.out.println("Enter the value of power:");
        int power = sc.nextInt();
        System.out.println("the maximum possible score is:" + bagOfTokensScore(tokens, power));
    }
}
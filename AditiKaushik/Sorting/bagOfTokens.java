// 948. Bag of Tokens

import java.util.Arrays;
import java.util.Scanner;

class bagOfTokens{
    public static int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int maxScore = 0;
        int start = 0;
        int end = tokens.length - 1;
        while (start <= end) {
            if (tokens[start] <= power) {
                power -= tokens[start];
                score++;
                start++;
            } else if (score > 0) {
                power += tokens[end];
                score--;
                end--;
            } else {
                break;
            }
            maxScore = Math.max(score, maxScore);
        }
        return maxScore;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] tokens = new int[size];
        for (int i = 0; i < tokens.length; i++) {
            System.out.println("Enter element " + (i+1) + " : ");
            tokens[i] = sc.nextInt();
        }
        System.out.println("Enter power: ");
        int power = sc.nextInt();
        System.out.println(bagOfTokensScore(tokens, power));
        sc.close();
    }
}

//Time Complexity: O(nlogn)
//Space Complexity: O(1)
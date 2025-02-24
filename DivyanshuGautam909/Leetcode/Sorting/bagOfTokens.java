package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class bagOfTokens {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);

        int score = 0;
        int maxScore = 0;
        int i = 0;
        int j = tokens.length - 1;

        while (i <= j) {
            if (power >= tokens[i]) {
                power -= tokens[i];
                score++;
                i++;
                maxScore = Math.max(maxScore, score);
            } else if (score > 0) {
                power += tokens[j];
                score--;
                j--;
            } else {
                break;
            }
        }

        return maxScore;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of tokens: ");
        int n = scanner.nextInt();
        int[] tokens = new int[n];

        System.out.println("Enter the token values:");
        for (int i = 0; i < n; i++) {
            tokens[i] = scanner.nextInt();
        }

        System.out.print("Enter the initial power: ");
        int power = scanner.nextInt();

        scanner.close();

        bagOfTokens obj = new bagOfTokens();
        int result = obj.bagOfTokensScore(tokens, power);

        System.out.println("Maximum possible score: " + result);
    }
}

import java.util.*;

public class MaxScoreFromCards {
    public int maxScore(int[] cardPoints, int k) {
        int Currsum = 0, sum = 0, n = cardPoints.length;

        for (int i = 0; i < k; i++) {
            Currsum += cardPoints[i];
        }
        sum = Currsum;

        for (int i = 0; i < k; i++) {
            Currsum = Currsum - cardPoints[k - 1 - i] + cardPoints[n - 1 - i];
            sum = Math.max(sum, Currsum);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] cardPoints = new int[n];

        for (int i = 0; i < n; i++) {
            cardPoints[i] = sc.nextInt();
        }

        MaxScoreFromCards sol = new MaxScoreFromCards();
        System.out.println(sol.maxScore(cardPoints, k));

        sc.close();
    }
}

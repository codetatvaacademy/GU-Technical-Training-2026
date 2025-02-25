import java.util.Scanner;

public class Kmaxpointobtainfromcards {
    public static int maxScore(int[] cardPoints, int k) {
        int lsum = 0;
        int rsum = 0;

        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            lsum += cardPoints[i];
            maxSum = lsum;
        }

        int rightSum = cardPoints.length - 1;
        for (int i = k - 1; i >= 0; i--) {
            lsum -= cardPoints[i];
            rsum += cardPoints[rightSum];
            rightSum--;
            maxSum = Math.max(maxSum, lsum + rsum);

        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int[] cardPoints = new int[size];
        for (int i = 0; i < size; i++) {
            cardPoints[i] = sc.nextInt();
        }
        System.out.println(maxScore(cardPoints, k));
    }
}

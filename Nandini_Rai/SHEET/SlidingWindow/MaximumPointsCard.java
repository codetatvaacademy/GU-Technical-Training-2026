import java.util.Scanner;

public class MaximumPointsCard {
        public int maxScore(int[] cardPoints, int k) {
            int start = 0;
            int end = 0;
            int totalSum = 0;
            int maxScore = 0;
            for (int i = 0; i < cardPoints.length; i++) {
                totalSum += cardPoints[i];
            }
            int t = cardPoints.length - k;
            while (end < cardPoints.length) {
                totalSum -= cardPoints[end];
                if (end - start + 1 > t) {
                    totalSum += cardPoints[start];
                    start++;
                }
                if ((end - start + 1) == t)
                    maxScore = Math.max(maxScore, totalSum);
                end++;
            }
            return maxScore;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cardPoints[] = new int[n];
        for(int i=0;i<cardPoints.length;i++){
           cardPoints[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        MaximumPointsCard mp = new MaximumPointsCard();
        System.out.println(mp.maxScore(cardPoints, k));
       }
}

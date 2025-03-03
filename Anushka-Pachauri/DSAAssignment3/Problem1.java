import java.util.*;
public class Problem1 {
    public static int minDifference(int[] weights, int k) {
        Arrays.sort(weights);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; (i + weights.length - k - 1) < n; i++) {
            int diff = weights[i + weights.length - k - 1] - weights[i];
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] weights = new int[n];
        
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }
        
        System.out.println(minDifference(weights, k));
    }
}
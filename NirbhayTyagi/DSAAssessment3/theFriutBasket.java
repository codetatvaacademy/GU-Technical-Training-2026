import java.util.*;
class theFriutBasket {
    public static int minPossibleDifference(int N, int K, int[] weights) {
        Arrays.sort(weights);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= N - K - 1; i++) {
            int diff = weights[i + (N - K) - 1] - weights[i];
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] weights = new int[N];
        for (int i = 0; i < N; i++) {
            weights[i] = sc.nextInt();
        }
        System.out.println(minPossibleDifference(N, K, weights));
        sc.close();
    }
}

// time complexity of the function is : O(nlogn)
//space complexity of the function is : O(1)

// time complexity of the main function is : O(nlogn) + O(n)
//space complexity of the main function ius : O(N)
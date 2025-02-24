// Using sorting and two pointer
// Time complexity -> O(nlogn) [inbuilt sort used]
// Space complexity -> O(1) [inplace swapping done]


import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(minimumPossibleDifference(n, k, weights));
    }

    private static int minimumPossibleDifference(int n, int k, int[] weights) {
        Arrays.sort(weights);                                // O(nlogn)

        if (weights[n - k - 1] == weights[n - 1]) {
            return 0;
        }
        if (k == 0) {
            return weights[n - 1] - weights[0];
        }
        if (k == 1) {
            weights[n - 1] = weights[k];
        }

        int first = 0;
        int second = n - k + 1;

        while (k > 1 && first <= second) {                   // O(k)
            if (weights[first] < 0) {
                weights[first++] = weights[second--];
            } else {
                weights[--n] = weights[second--];
            }
        }

        int min = weights[0];
        int max = weights[weights.length - 1];

        for (int i : weights) {                               // O(n)
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        return max - min;
    }
}
import java.util.*;

class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length();
        int[] prefixSum = new int[n];
        int[] leftCandle = new int[n];
        int[] rightCandle = new int[n];
        int[] result = new int[queries.length];

        for (int i = 0, count = 0; i < n; i++) {
            if (s.charAt(i) == '*') {
                count++;
            }
            prefixSum[i] = count;
        }

        for (int i = 0, left = -1; i < n; i++) {
            if (s.charAt(i) == '|') {
                left = i;
            }
            leftCandle[i] = left;
        }

        for (int i = n - 1, right = -1; i >= 0; i--) {
            if (s.charAt(i) == '|') {
                right = i;
            }
            rightCandle[i] = right;
        }

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            int l = rightCandle[left]; 
            int r = leftCandle[right]; 
            if (l != -1 && r != -1 && l < r) {
                result[i] = prefixSum[r] - prefixSum[l];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string (plates & candles): ");
        String s = scanner.next();

        System.out.print("Enter number of queries: ");
        int q = scanner.nextInt();
        int[][] queries = new int[q][2];

        System.out.println("Enter queries (start & end indices): ");
        for (int i = 0; i < q; i++) {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
        }

        int[] result = sol.platesBetweenCandles(s, queries);
        System.out.println("Results: " + Arrays.toString(result));

        scanner.close();
    }
}

import java.util.*;

class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxProfit = 0;
        int[][] arr = new int[profit.length][2];

        for (int i = 0; i < profit.length; i++) {
            arr[i][0] = difficulty[i];
            arr[i][1] = profit[i];
        }

        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        Arrays.sort(worker);

        int bestProfit = 0, jobIndex = 0;

        for (int w : worker) {
            while (jobIndex < arr.length && arr[jobIndex][0] <= w) {
                bestProfit = Math.max(bestProfit, arr[jobIndex][1]);
                jobIndex++;
            }
            maxProfit += bestProfit;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of jobs: ");
        int n = scanner.nextInt();
        int[] difficulty = new int[n];
        int[] profit = new int[n];

        System.out.println("Enter difficulty levels:");
        for (int i = 0; i < n; i++) {
            difficulty[i] = scanner.nextInt();
        }

        System.out.println("Enter corresponding profits:");
        for (int i = 0; i < n; i++) {
            profit[i] = scanner.nextInt();
        }

        System.out.print("Enter number of workers: ");
        int m = scanner.nextInt();
        int[] worker = new int[m];

        System.out.println("Enter worker skill levels:");
        for (int i = 0; i < m; i++) {
            worker[i] = scanner.nextInt();
        }

        Solution sol = new Solution();
        int result = sol.maxProfitAssignment(difficulty, profit, worker);
        System.out.println("Maximum total profit: " + result);

        scanner.close();
    }
}

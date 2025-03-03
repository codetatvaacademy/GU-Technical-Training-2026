import java.util.*;

class Solution {
    private int BinarySearch(int[][] arr, int worker) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (worker >= arr[mid][0]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxProfit = 0;
        int[][] arr = new int[profit.length][2];

        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = difficulty[i];
            arr[i][1] = profit[i];
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        for (int i = 1; i < arr.length; i++) {
            arr[i][1] = Math.max(arr[i][1], arr[i - 1][1]);
        }

        for (int i = 0; i < worker.length; i++) {
            int index = BinarySearch(arr, worker[i]);
            maxProfit += index == -1 ? 0 : arr[index][1];
        }
        return maxProfit;
    }
}

public class mostProfitAssigningWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of jobs: ");
        int n = scanner.nextInt();
        int[] difficulty = new int[n];
        int[] profit = new int[n];

        System.out.println("Enter the difficulty levels of jobs:");
        for (int i = 0; i < n; i++) {
            difficulty[i] = scanner.nextInt();
        }

        System.out.println("Enter the profit values of jobs:");
        for (int i = 0; i < n; i++) {
            profit[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of workers: ");
        int m = scanner.nextInt();
        int[] worker = new int[m];

        System.out.println("Enter the skill levels of workers:");
        for (int i = 0; i < m; i++) {
            worker[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int maxProfit = solution.maxProfitAssignment(difficulty, profit, worker);
        System.out.println("Maximum profit that can be earned: " + maxProfit);

        scanner.close();
    }
}

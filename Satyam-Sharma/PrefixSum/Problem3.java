package problems;

import java.util.Scanner;

public class Problemthree {
    int[][] arr;

    public Problemthree(int[][] arr) {
        this.arr = arr;
    }
    
    public static int[] blockSum(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] dp = new int[m][n];
        prefixSum(dp, m, n, arr);
        int[] ans = new int[m];
        for (int i = 1; i < m; i++) {
            int si = arr[i][0];
            int sj = arr[i][1];
            int ei = arr[i][2];
            int ej = arr[i][3];
            ans[i] = query(dp, si, sj, ei, ej);
        }

        return ans;

    }

    public static int[][] prefixSum(int[][] dp, int m, int n, int[][] arr) {
        dp[0][0] = arr[0][0];
        for (int i = 1; i < m; i++) {
            dp[i][0] = arr[i][0] + dp[i - 1][0];
        }

        for (int i = 1; i < n; i++) {
            dp[0][i] = arr[0][i] + dp[0][i - 1];

        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = arr[i][j] + dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1];
            }
        }

        return dp;

    }

    public static int query(int[][] dp, int si, int sj, int ei, int ej) {
        if (si == 0 && sj != 0) {
            return dp[ei][ej] - dp[ei][sj - 1];
        }

        else if (si != 0 && sj == 0) {
            return dp[ei][ej] - dp[si - 1][ej];
        }

        else if (si == 0 && sj == 0) {
            return dp[ei][ej];
        }

        else {
            return dp[ei][ej] + dp[si - 1][ej] + dp[ei][sj - 1] - dp[si - 1][sj - 1];
        }
    }

    public static void main(String[] args) {
        Problemthree p= new Problemthree([[3, 0, 1, 4, 2], [5, 6, 3, 2, 1], [1, 2, 0, 1, 5], [4,
        1, 0, 1, 7], [1, 0, 3, 0, 5]]);
        
    }
}

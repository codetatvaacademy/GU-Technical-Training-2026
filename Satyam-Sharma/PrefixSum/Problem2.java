package problems;

import java.util.Scanner;
public class Problemtwo {
    public static void isPresent(int[][] arr, int n) {
        int s = 1;
        int[] sum = new int[n];
        int f = 0;
        while (s <= n) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length - 2; j++) {
                    if (arr[i][j] <= s && arr[i][j + 1] >= s) {
                        sum[f] += arr[i][j + 2];
                    }
                }
            }
            s++;
            f++;

        }
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows number- ");
        int m = sc.nextInt();
        System.out.println("Number of Colums- ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        isPresent(arr, 5);
        
    }
}

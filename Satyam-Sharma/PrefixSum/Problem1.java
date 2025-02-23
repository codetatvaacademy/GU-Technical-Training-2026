package problems;
import java.util.Scanner;
public class Problemone {
    public static int pivotIndex(int[] arr) {
        int[] dp = new int[arr.length];
        dp[0] = 0;
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            dp[i] = dp[i - 1] + arr[i - 1];
        }
        for (int i = 0; i < dp.length; i++) {
            if (sum - arr[i] - dp[i] == dp[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        System.out.println("Enter values-");
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            arr[i]=v;
        }
        System.out.println("Pivot Index is- ");
        int ans=pivotIndex(arr);
        System.out.println(ans);

    }
}

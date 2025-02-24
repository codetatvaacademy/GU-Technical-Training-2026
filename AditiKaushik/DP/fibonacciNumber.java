//509. Fibonacci Number

import java.util.Scanner;

class fibonacciNumber {
    public static int fib(int n) {
        if (n <= 1)
            return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position of Fibonacci Number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number at position " + n + " is: " + fib(n));
        sc.close();
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)
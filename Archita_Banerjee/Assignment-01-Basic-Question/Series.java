import java.util.Scanner;

public class Series {

    // Series: 1, 3, 6, 10, 15, ... nth term
    public static void series1(int n) {
        int sum = 0;
        System.out.print("Series 1: ");
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.print(sum + " ");
        }
        System.out.println();
    }

    // Series: 1, 11, 111, 1111, ... nth term
    public static void series2(int n) {
        int num = 0;
        System.out.print("Series 2: ");
        for (int i = 1; i <= n; i++) {
            num = num * 10 + 1;
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Series: 1, 12, 123, 1234, … nth term
    public static void series3(int n) {
        System.out.print("Series 3: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    // Series: 0, 7, 26, 63, … nth term
    public static void series4(int n) {
        System.out.print("Series 4: ");
        for (int i = 0; i < n; i++) {
            System.out.print((i * i * i - 1) + " ");
        }
        System.out.println();
    }

    // Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, … nth term
    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Series: 0, 1, 3, 7, 15, … nth term
    public static void series6(int n) {
        System.out.print("Series 6: ");
        for (int i = 1; i <= n; i++) {
            int term = (int) Math.pow(2, i) - 1;
            System.out.print(term + " ");
        }
        System.out.println();
    }

    // Series: x - x^2 + x^3 - x^4 + x^5 … nth term (sum also)
    public static void series7(int x, int n) {
        int sum = 0;
        System.out.print("Series 7: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= Math.pow(x, i);
            } else {
                sum += Math.pow(x, i);
            }
            System.out.print((int)Math.pow(x, i) * (i % 2 == 0 ? -1 : 1) + " ");
        }
        System.out.println("\nSum of Series 7: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n for the number of terms: ");
        int n = sc.nextInt();

        // Call all series functions
        series1(n);
        series2(n);
        series3(n);
        series4(n);
        fibonacci(n);
        series6(n);

        System.out.print("Enter the value of x for series 7: ");
        int x = sc.nextInt();
        series7(x, n);

        sc.close();
    }
}

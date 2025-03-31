// WAP to take input a number from user and print in the form of series:

// 1. 1, 3, 6, 10, 15, ... nth term
// 2. 1, 11, 111, 1111, ... nth term
// 3. 1, 12, 123, 1234, ... nth term
// 4. 0, 7, 26, 63, ... nth term
// 5. 0, 1, 1, 2, 3, 5, 8, ... nth term
// 6. 0, 1, 3, 7, 15, ... nth term
// 7. x - x ^ 2 + x ^ 3 - x ^ 4 + x ^ 5 ... nth term (do sum here also)

import java.util.Scanner;

public class numberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of x for the last series: ");
        int x = scanner.nextInt();
        scanner.close();

        System.out.println("Series 1:");
        seriesOne(n);
        
        System.out.println("Series 2:");
        seriesTwo(n);
        
        System.out.println("Series 3:");
        seriesThree(n);
        
        System.out.println("Series 4:");
        seriesFour(n);
        
        System.out.println("Series 5:");
        seriesFive(n);
        
        System.out.println("Series 6:");
        seriesSix(n);
        
        System.out.println("Series 7:");
        seriesSeven(n, x);
    }

    public static void seriesOne(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.print(sum + " ");
        }
        System.out.println();
    }

    public static void seriesTwo(int n) {
        int num = 0;
        for (int i = 1; i <= n; i++) {
            num = num * 10 + 1;
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void seriesThree(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void seriesFour(int n) {
        for (int i = 1; i < n; i++) {
            System.out.print((i * i * i) - 1 + " ");
        }
        System.out.println();
    }

    public static void seriesFive(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void seriesSix(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print((int) Math.pow(2, i) - 1 + " ");
        }
        System.out.println();
    }

    public static void seriesSeven(int n, int x) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int term = (int) Math.pow(x, i);
            if (i % 2 == 0) {
                term *= -1;
            }
            sum += term;
            System.out.print(term + " ");
        }
        System.out.println("\nTotal Sum: " + sum);
    }
}


//Time Complexity:
// seriesOne(n)	    O(n)
// seriesTwo(n)	    O(n)
// seriesThree(n)	O(n²)
// seriesFour(n)	O(n)
// seriesFive(n)	O(n)
// seriesSix(n)	    O(n)
// seriesSeven(n)	O(n log n)

//Space Complexity: O(1)
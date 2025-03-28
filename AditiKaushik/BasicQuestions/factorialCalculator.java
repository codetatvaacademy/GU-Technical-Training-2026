// WAP to input a number from user and print its factorial.

import java.util.Scanner;

public class factorialCalculator {
    public static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }

        long factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        if (num < 0) {
            System.out.println("Factorial does not exist for negative numbers.");
        } else {
            System.out.println(calculateFactorial(num));
        }
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
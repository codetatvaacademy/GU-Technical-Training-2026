// 	WAP to print the sum of the divisors of a number given by user.

import java.util.Scanner;

public class sumOfDivisors {
    public static int sum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println(sum(num));
        scanner.close();
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
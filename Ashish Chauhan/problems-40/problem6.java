// 6.WAP to take input 3 digit numbers from the user and print sum of 1 and 3 digit.
import java.util.Scanner;

public class SumFirstLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a three-digit number: ");
        int num = scanner.nextInt();

        int firstDigit = num / 100;
        int lastDigit = num % 10;
        int sum = firstDigit + lastDigit;

        System.out.println("Sum of first and last digit: " + sum);

        scanner.close();
    }
}

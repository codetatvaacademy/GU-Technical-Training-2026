// 7. WAP to take input 3 digit numbers from the user and print the square of the middle digit.
import java.util.Scanner;

public class MiddleDigitSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a three-digit number: ");
        int num = scanner.nextInt();

        int middleDigit = (num / 10) % 10;
        int square = middleDigit * middleDigit;
        System.out.println("Square of the middle digit: " + square);

        // Close the scanner
        scanner.close();
    }
}

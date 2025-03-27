// WAP to perform arithmetic operations as per user's choice.

import java.util.Scanner;

public class arithmeticOperations {
    public static double calculate(double num1, double num2, int choice) {
        switch (choice) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                if (!(num2 == 0)) {
                    return num1 / num2;
                }
            case 5:
                if (!(num2 == 0)) {
                    return num1 % num2;
                }
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 5.");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");

        System.out.print("\nEnter your choice (1-5): ");
        int choice = scanner.nextInt();
        double result = calculate(num1, num2, choice);
        System.out.println(result);
        scanner.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)
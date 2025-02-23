
import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        

    System.out.println("Select operation:");
    System.out.println("1. Addition (+)");
    System.out.println("2. Subtraction (-)");
    System.out.println("3. Multiplication (*)");
    System.out.println("4. Division (/)");

    System.out.print("Enter your choice (1/2/3/4): ");
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();

    if (choice >= 1 && choice <= 4) {
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("The result of addition is: " + (num1 + num2));
                break;
            case 2:
                System.out.println("The result of subtraction is: " + (num1 - num2));
                break;
            case 3:
                System.out.println("The result of multiplication is: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("The result of division is: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
        }
    } else {
        System.out.println("Invalid choice. Please try again.");
    }

    
}
}

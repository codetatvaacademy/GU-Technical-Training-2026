// WAP to take input 2 numbers from the user and print their difference.
import java.util.Scanner;

public class NumberDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int difference = num1 - num2;
        System.out.println("The difference between the numbers is: " + difference);
        
        scanner.close();
    }
}

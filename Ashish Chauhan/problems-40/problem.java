// 15.WAP to take input 3 numbers and print the 2nd largest number among them.
import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        
        int largest = Math.max(num1, Math.max(num2, num3));
        int smallest = Math.min(num1, Math.min(num2, num3));
        int secondLargest = (num1 + num2 + num3) - (largest + smallest);
        
        System.out.println("The second largest number is: " + secondLargest);
        
        scanner.close();
    }
}

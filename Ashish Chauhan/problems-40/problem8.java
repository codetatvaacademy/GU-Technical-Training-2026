// 8. WAP to take input 4 digit numbers from the user and print its all digits.
import java.util.Scanner;

public class PrintAllDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a four-digit number: ");
        int num = scanner.nextInt();

        int firstDigit = num / 1000;         
        int secondDigit = (num / 100) % 10;   
        int thirdDigit = (num / 10) % 10;     
        int fourthDigit = num % 10;           
        System.out.println("Digits of the number: ");
        System.out.println(firstDigit);
        System.out.println(secondDigit);
        System.out.println(thirdDigit);
        System.out.println(fourthDigit);

        scanner.close();
    }
}

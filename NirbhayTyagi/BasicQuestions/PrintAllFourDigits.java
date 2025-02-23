//WAP to take input 4 digit numbers from the user and print its all digits//
import java.util.Scanner;
public class PrintAllFourDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a four digit no:");
        int number = sc.nextInt();
        if(number < 1000 || number > 9999){
            System.out.println("Please enter a valid four digit no:");
        } else {
            int thousands = number / 1000;
            int hundreds = (number % 1000) / 100;
            int tens = (number % 100) / 10;
            int ones = number % 10;
            System.out.println("The digits are:");
            System.out.println("Thousands place: " + thousands);
            System.out.println("Hundreds place: " + hundreds);
            System.out.println("Tens place: " + tens);
            System.out.println("Ones place: " + ones);
        }
    }
}

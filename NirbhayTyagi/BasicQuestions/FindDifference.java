//WAP to take input 2 numbers from the user and print their difference//
import java.util.Scanner;
public class FindDifference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = sc.nextInt();
        System.out.println("Enter second number:");
        int number2 = sc.nextInt();
        int difference = number1 - number2;
        System.out.println("The difference of these  no is:" + difference);
    }
}

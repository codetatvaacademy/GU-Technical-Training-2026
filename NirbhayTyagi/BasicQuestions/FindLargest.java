//WAP to take input two numbers from the user and print the largest of them.//
import java.util.Scanner;
public class FindLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = sc.nextInt();
        System.out.println("Enter second number:");
        int number2 = sc.nextInt();
        int largest = Math.max(number1, number2);
        System.out.println("The largest no is:" + largest);
    }
}

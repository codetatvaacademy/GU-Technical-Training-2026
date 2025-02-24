//WAP to perform arithmetic operations as per user's choice.//
import java.util.Scanner;
public class ArithmeticOperations{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose one operation:");
        System.out.println("1.Adition:");
        System.out.println("2.Substraction:");
        System.out.println("3.Multiplication:");
        System.out.println("4.Division:");
        System.out.println("5.Modulud:");
        System.out.println("Enter the number of your choise:");
        int choise = sc.nextInt();
        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = sc.nextDouble();
        double result = 0.0;
        switch(choise){
            case 1: 
            result = num1 + num2;
            System.out.println("The result of addition is: " + result);
            break;
            case 2: 
            result = num1 - num2;
            System.out.println("The result of substraction is: " + result);
            break;
            case 3: 
            result = num1 * num2;
            System.out.println("The result of multiplication is: " + result);
            break;
            case 4: 
            result = num1 / num2;
            System.out.println("The result of division is: " + result);
            break;
            case 5: 
            result = num1 % num2;
            System.out.println("The result of modulus is: " + result);
            break;
            default:
            System.out.println("Invalid choice. Please select a valid option between 1 and 5.");
            break;
        }
    }
}
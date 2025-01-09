package Atishay_Jain;

import java.util.*;

public class Arithmetic {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1=sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2=sc.nextDouble();

        System.out.println("Choose an operator: + , - , * or /");
        char operator=sc.next().charAt(0);
        
        double result=0;

        switch (operator) {
            case '+':
                result=num1+num2;
                System.out.print("Addition is "+ result);
                break;

            case '-':
                result=num1-num2;
                System.out.print("Subtraction is "+ result);
                break;

                case '*':
                result=num1*num2;
                System.out.print("Multiplication is "+ result);
                break;

                case '/':
                result=num1/num2;
                System.out.print("Division is "+ result);
                break;
        
            default:
                System.out.println("Invalid case!");
                break;
        }
    }
}

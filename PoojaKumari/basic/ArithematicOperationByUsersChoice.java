//Question 22
import java.util.*;
public class ArithematicOperationByUsersChoice {
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1=sc.nextInt();
        System.out.println("Enter number 2:");
        int num2=sc.nextInt();
        System.out.println("Enter number 3:");
        int num3=sc.nextInt();
        System.out.println("Enter Operations:");
        System.out.println("1.addition");
        System.out.println("2.substraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        System.out.println("Enter your choice 1/2/3/4");

        int choice=sc.nextInt();
        int result=0;
        switch (choice)
        { case 1: 
            result = num1 + num2+num3; 
            System.out.println("Result: " + result);
             break;
         case 2: result = num1 - num2-num3;
          System.out.println("Result: " + result);
          break; 
          case 3:
           result = num1 * num2*num3; 
           System.out.println("Result: " + result); 
           break; case 4: 
           if (num2 != 0 && num3!=0) { 
            result = (num1 / num2)/num3; 
            System.out.println("Result: " + result); 
        } else { 
            System.out.println("Error: Division by zero is not allowed.");
            break;
            }
        
        }
        sc.close();
    }
}

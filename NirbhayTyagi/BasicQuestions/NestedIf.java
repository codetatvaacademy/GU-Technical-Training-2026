//WAP to take input 3 numbers from the user and print the largest number among them using nested if.//
import java.util.Scanner;
public class NestedIf {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no:");
        int number1 = sc.nextInt();
        System.out.println("Enter second no:");
        int number2 = sc.nextInt();
        System.out.println("Enter third no:");
        int number3 = sc.nextInt();
        if(number1 > number2){
            if(number1 > number3){
                System.out.println("Number1 is largest no:");
            }else{
                System.out.println("Number3 is largest no:");
            }
        }else{
            if (number2 > number3) {
                System.out.println("The largest number is: " + number2);
            } else {
                System.out.println("The largest number is: " + number3);
            }    
        }
    }
}

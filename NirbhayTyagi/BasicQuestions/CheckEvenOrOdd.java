//WAP to check whether a number is even or odd.//
import java.util.Scanner;
public class CheckEvenOrOdd {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if( number % 2 == 0){
            System.out.println("The number is even:");
        }else{
            System.out.println("The number is odd:");
        }
    }
}

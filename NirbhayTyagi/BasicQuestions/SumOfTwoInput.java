//WAP to take input 2 numbers from the user and print the sum of the numbers.//
import java.util.Scanner;
public class SumOfTwoInput{
    public static int sum(int a, int b){
        int c = a +  b;
        return c;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("the sum of two number is :" + sum(a,b));
    }
}
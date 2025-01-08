// //1. WAP to take input 2 numbers from the user and print the sum of the numbers.
import java.util.Scanner;
public class problem01{
    public static int sumNumber(int a, int b){
      return a + b; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("enter the second number: ");
        int n2 = sc.nextInt();
        int result = sumNumber(n1,n2);
        System.out.println("The sum of "+ n1 + " and " + n2 + " is : " + result);
        sc.close();
      }
 }

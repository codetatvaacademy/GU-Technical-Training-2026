//WAP to take input 3 digit numbers from the user and print sum of 1 and 3 digit//
import java.util.Scanner;
public class SumOfFirstAndLastDigit{
    public static int sum(int a){
        int s = 0;
        if (a >= 100 && a <= 999) {
            int firstDigit = a / 100;       
            int thirdDigit = a % 10;         
            s = firstDigit + thirdDigit;
        }    
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three digit number:");
        int a = sc.nextInt();
        System.out.println("The Sum Of First And Last Digit No. Is:" + sum(a));
    }
}
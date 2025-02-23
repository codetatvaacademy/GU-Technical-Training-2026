//WAP to take input 3 digit numbers from the user and print the square of the middle digit.//
import java.util.Scanner;
public class SquareOfMiddleDigit{
    public static int middle(int m){
        int s = 0;
        if(m >= 100 && m <= 999){
            int middleDigit = (m / 10) % 10;
            s = middleDigit * middleDigit;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digit number:");
        int m = sc.nextInt();
        System.out.println("The Square Of Middle Digit Is:" + middle(m));

    }
}
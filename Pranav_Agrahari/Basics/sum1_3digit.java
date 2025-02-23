import java.util.Scanner;

public class sum1_3digit {
    public static int digit (int a ){
        int b = a%100;
        int c = b%10; // 3rd Digit
        int d = a/100; // 1st Digit
        int sumofdigit = c+d;  // Sum of first and third digit 
        return sumofdigit;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int a = sc.nextInt();
        System.out.println("The sum of the digit is " + digit(a) );
       
    }
}
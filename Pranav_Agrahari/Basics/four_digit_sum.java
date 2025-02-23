import java.util.Scanner;

public class four_digit_sum {
    public static int sum_digit(int a) {
        int sum = 0;
        int b = a / 1000; // First Digit
        if (b != 0) {
            System.out.println("Valid Number");
            int c = a % 1000;
            int d = c % 10; // fourth digit
            int e = c / 10;
            int f = e % 10; // third digit
            int g = e / 10; // second digit
            sum = b + d + f + g;
        } else {
            System.out.println("Not a valid number");
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Four Digit Number");
        int a = sc.nextInt();
        System.out.println("The sum of the digit is " + sum_digit(a));

    }
}

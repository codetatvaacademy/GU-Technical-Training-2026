import java.util.Scanner;
public class SumFirstandThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int firstDigit = num / 100;
        int thirdDigit = num % 10;

        int sum = firstDigit + thirdDigit;
        System.out.println("Sum of 1st and 3rd digit: " + sum);
    }
}

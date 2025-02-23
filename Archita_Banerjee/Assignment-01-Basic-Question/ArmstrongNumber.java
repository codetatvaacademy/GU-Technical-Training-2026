import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int org = num;
        int res = 0;

        while (num != 0) {
            int digit = num % 10;
            res += Math.pow(digit, 3);
            num /= 10;
        }

        if (res == org) {
            System.out.println(org + " is an Armstrong number.");
        } else {
            System.out.println(org + " is not an Armstrong number.");
        }
    }
}

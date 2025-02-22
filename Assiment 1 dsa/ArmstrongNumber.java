import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();

        int original = n, sum = 0, digits = 0, temp = n;

        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == original)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");

        s.close();
    }
}

import java.util.Scanner;
public class FourDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a four digit number: ");
        int digit = sc.nextInt();
        sc.close();
        int temp = digit;
        int track = 1000;
        System.out.print("Digits of four digit number are: ");
        while (temp!=0) {
            int dig = temp / track;
            temp %= track;
            System.out.print(dig + " ");
            track/=10;
        }
    }
}
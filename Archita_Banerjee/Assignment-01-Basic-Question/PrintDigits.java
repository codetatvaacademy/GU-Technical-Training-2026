import java.util.Scanner;
public class PrintDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int num = sc.nextInt();

        // Extract and print all digits
        int fdigit = num / 1000;
        int sdigit = (num / 100) % 10;
        int tdigit = (num / 10) % 10;
        int fourdigit = num % 10;

        System.out.println("Digits: " + fdigit+ " " + sdigit + " " + tdigit + " " + fourdigit);
    }
}

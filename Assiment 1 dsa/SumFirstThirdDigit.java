import java.util.Scanner;

public class SumFirstThirdDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit");
        int number = scanner.nextInt();

        int first = number / 100;
        int third = number % 10;
        int sum = first + third;

        System.out.println(sum);
        scanner.close();
    }
}
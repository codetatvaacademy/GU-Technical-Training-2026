import java.util.Scanner;
import java.util.Arrays;
public class DescendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[3];
        System.out.print("Enter first number: ");
        numbers[0] = sc.nextInt();
        System.out.print("Enter second number: ");
        numbers[1] = sc.nextInt();
        System.out.print("Enter third number: ");
        numbers[2] = sc.nextInt();


        Arrays.sort(numbers);
        System.out.println("Numbers in descending order: " + numbers[2] + " " + numbers[1] + " " + numbers[0]);

    }
}

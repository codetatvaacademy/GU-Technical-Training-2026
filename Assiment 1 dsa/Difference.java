import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = s.nextInt();
        System.out.print("Enter second number: ");
        int b = s.nextInt();

        int diff = a - b;
        System.out.println("Difference: " + diff);

        s.close();
    }
}

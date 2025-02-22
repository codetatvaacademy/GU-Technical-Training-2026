import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first");
        int a = s.nextInt();
        System.out.print("Enter second");
        int b = s.nextInt();

        int max = (a > b) ? a : b;
        System.out.println("Largest number" + max);

        s.close();
    }
}

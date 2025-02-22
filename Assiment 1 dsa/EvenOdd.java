import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();

        if (n % 2 == 0)
            System.out.println(n + "Even");
        else
            System.out.println(n + "Odd");

        s.close();
    }
}

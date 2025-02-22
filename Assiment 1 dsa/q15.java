import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = s.nextInt();
        System.out.print("Enter second number: ");
        int b = s.nextInt();
        System.out.print("Enter third number: ");
        int c = s.nextInt();

        if ((a > b && a < c) || (a > c && a < b))
            System.out.println(a);
        else if ((b > a && b < c) || (b > c && b < a))
            System.out.println(b);
        else
            System.out.println(c);

        s.close();
    }
}

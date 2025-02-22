import java.util.Scanner;

public class LargestNestedIf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first");
        int a = s.nextInt();
        System.out.print("Enter second ");
        int b = s.nextInt();
        System.out.print("Enter third");
        int c = s.nextInt();

        int max;
        if (a > b) {
            if (a > c)
                max = a;
            else
                max = c;
        } else {
            if (b > c)
                max = b;
            else
                max = c;
        }

        System.out.println(max);
        s.close();
    }
}

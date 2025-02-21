import java.util.Scanner;

public class NumCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = s.nextInt();

        if (n > 0)
            System.out.println(n + "Positive");
        else if (n < 0)
            System.out.println(n + "Negative");
        else
            System.out.println(n + "Zero");

        s.close();
    }
}

import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a four-digit number");
        int n = s.nextInt();

        int d1 = n / 1000;
        int d2 = (n / 100) % 10;
        int d3 = (n / 10) % 10;
        int d4 = n % 10;

        System.out.println(d1 + " " + d2 + " " + d3 + " " + d4);
        s.close();
    }
}

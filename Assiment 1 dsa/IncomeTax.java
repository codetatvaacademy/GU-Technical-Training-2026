import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your income: ");
        double income = s.nextDouble();
        double tax = 0;

        if (income <= 10000) {
            tax = 0;
        } else if (income <= 25000) {
            tax = (income - 10000) * 0.10;
        } else if (income <= 50000) {
            tax = 2500 + (income - 25000) * 0.20;
        } else {
            tax = 5000 + (income - 50000) * 0.30;
        }

        System.out.println(tax);
        s.close();
    }
}

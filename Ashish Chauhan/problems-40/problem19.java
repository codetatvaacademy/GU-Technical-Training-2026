// WAP to take input income from the user and calculate the amount of tax to be paid as per rules.
// Less or equal to 10,000 -> no tax
// Greater than 10,000 and less or equal to 25,000 -> 10% of income above 10,000
// Greater than 25,000 and less or equal to 50,000 -> 2500 + 20% income above 25,000
// Greater than 50,000 -> 5000 + 30% of income above 50,000
import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();
        double tax = 0;
        
        if (income > 50000) {
            tax = 5000 + (income - 50000) * 0.30;
        } else if (income > 25000) {
            tax = 2500 + (income - 25000) * 0.20;
        } else if (income > 10000) {
            tax = (income - 10000) * 0.10;
        }
        
        System.out.println("Tax to be paid: Rs. " + tax);
        
        scanner.close();
    }
}

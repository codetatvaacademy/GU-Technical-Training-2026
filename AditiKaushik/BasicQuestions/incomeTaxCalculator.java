// WAP to take input income from the user and calculate the amount of tax to be paid as per rules.
// 1. Less or equal to 10,000 -> no tax
// 2. Greater than 10,000 and less or equal to 25,000 -> 10% of income above 10,000
// 3. Greater than 25,000 and less or equal to 50,000 -> 2500 + 20% income above 25,000
// 4. Greater than 50,000 -> 5000 + 30% of income above 50,000

import java.util.Scanner;

public class incomeTaxCalculator {
    public static double calculateTax(double income) {
        double tax;
        if (income <= 10000) {
            tax = 0;
        } else if (income <= 25000) {
            tax = 0.10 * (income - 10000);
        } else if (income <= 50000) {
            tax = 2500 + 0.20 * (income - 25000);
        } else {
            tax = 5000 + 0.30 * (income - 50000);
        }
        return tax;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();
        System.out.println(calculateTax(income));

        scanner.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)
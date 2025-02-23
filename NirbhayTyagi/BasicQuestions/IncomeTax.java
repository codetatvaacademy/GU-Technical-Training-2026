//WAP to take input income from the user and calculate the amount of tax to be paid as per rules.//
import java.util.Scanner;
public class IncomeTax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income:");
        double income = sc.nextDouble();
        double tax = 0.0;
        if (income <= 250000) {
            tax = 0.0; // No tax for income up to ₹2.5 lakh
        } else if (income <= 500000) {
            tax = (income - 250000) * 0.05; // 5% tax on income between ₹2.5L to ₹5L
        } else if (income <= 1000000) {
            tax = (250000 * 0.05) + (income - 500000) * 0.20; // 20% tax on income between ₹5L to ₹10L
        } else {
            tax = (250000 * 0.05) + (500000 * 0.20) + (income - 1000000) * 0.30; // 30% tax on income above ₹10L
        }
        System.out.println("The tax to be paid is :" + tax);
    }
}
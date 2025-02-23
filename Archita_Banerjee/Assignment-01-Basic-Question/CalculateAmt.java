import java.util.Scanner;
public class CalculateAmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        double amount = rate * quantity;
        if (amount > 2000) {
            double discount = amount * 0.15;
            double netAmount = amount - discount;
            System.out.println("Amount after 15% discount: " + netAmount);
        } else {
            System.out.println("Amount to be paid: " + amount);
        }
    }
}

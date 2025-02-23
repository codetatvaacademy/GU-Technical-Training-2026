// 14.WAP to take input rate & quantity and calculate the amount. Finally print net amount to be paid after allowing 15% discount if amount exceeds 2000 rs.
import java.util.Scanner;

public class NetAmountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter rate: ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        
        double amount = rate * quantity;
        
        if (amount > 2000) {
            amount -= amount * 0.15;
        }
        
        System.out.println("Net amount to be paid: " + amount);
        
        scanner.close();
    }
}

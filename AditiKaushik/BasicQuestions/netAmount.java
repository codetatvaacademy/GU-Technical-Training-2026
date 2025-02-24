//WAP to take input rate & quantity and calculate the amount. Finally print net amount to be paid after allowing 15% discount if amount exceeds 2000 rs.

import java.util.Scanner;

class netAmount {
    public static void amountPaid(double rate, int quantity){
        double amount = rate * quantity;
        double discount = 0;
        if (amount > 2000) {
            discount = amount * 0.15;
        }
        double netAmount = amount - discount;
        System.out.println("Total Amount: Rs. " + amount);
        if (discount > 0) {
            System.out.println("Discount (15%): Rs. " + discount);
        }
        System.out.println("Net Amount to be Paid: Rs. " + netAmount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        amountPaid(rate, quantity);
        sc.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)
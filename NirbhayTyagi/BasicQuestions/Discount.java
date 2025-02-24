import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the prize:");
        int prize = sc.nextInt();
        System.out.println("Enter the quantity:");
        int quantity = sc.nextInt();
        int totalAmount = prize * quantity;
        if(totalAmount > 2000){
            double discountAmount = 0.15 * totalAmount;
            double netAmount = totalAmount - discountAmount;
            System.out.println("The net amount to be paid is:" + netAmount);
        }else{
            System.out.println("The net amount to be paid is:" + totalAmount);
        }
    }
}
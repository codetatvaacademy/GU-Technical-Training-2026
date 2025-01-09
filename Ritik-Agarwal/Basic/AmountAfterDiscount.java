import java.util.Scanner;
public class AmountAfterDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rate of product: ");
        int rate = sc.nextInt();
        System.out.println("Enter quantity of product: ");
        int quantity = sc.nextInt();
        sc.close();
        int amount = rate*quantity;
        int discount = 0;
        if(amount>2000){
            amount = (amount*15)/100;
        }
        System.out.println("Net amount of product is: " + (amount-discount));
    }
}
import java.util.Scanner;

import org.w3c.dom.events.MouseEvent;

public class Problem14 {
    // WAP to take input rate & quantity and calculate the amount. Finally print net amount to be paid after allowing 15% discount if amount exceeds 2000 rs.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity= sc.nextInt();

        //Amount calc : rate * quant
        double amount = rate * quantity ;

        //Apply discount if amount exceeds 2000
        if(amount > 2000){
            double discount = 0.15 * amount ; // Applying 15 % discount
            amount -= discount ;
        }
        System.out.println( "Net amount to be paid: " + amount);
        
    }
    
}

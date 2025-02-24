//Question 15
import java.util.*;
public class CalculateNetAmount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rate:");
        double rate=sc.nextDouble();
        System.out.println("Enter Quantity: ");
        int Quantity=sc.nextInt();
        double amount=rate*Quantity;
        double netamount;
        if(amount>2000){
             netamount=amount-(amount*0.15);
        }else{
            netamount=amount;
        }
        System.out.println("Netamount to be paid:"+netamount);
    }
    
}

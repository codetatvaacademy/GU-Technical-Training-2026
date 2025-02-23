import java.util.Scanner;

public class discount { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rate = sc.nextInt();
        float quantity = sc.nextFloat();
        float amount =rate*quantity;
        if(amount<2000){
            System.out.println(amount);
        }
       else if (amount>2000){
            double net_amount = (amount - (amount*0.15));
            System.out.println("amount " + net_amount);
        }
    }
    
}

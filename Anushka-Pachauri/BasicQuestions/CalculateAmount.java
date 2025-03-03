import java.util.*;
class CalculateAmount{
    static double calculateAmount(int rate,int quantity){
        double amount=0;
        amount=rate*quantity;
        if(amount>2000){
            amount-=(0.15*amount);
        }
        return amount;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rate:");
        int rate=sc.nextInt();
        System.out.println("Enter quantity:");
        int quantity=sc.nextInt();
        System.out.println("Amount= "+calculateAmount(rate,quantity));

    }
}
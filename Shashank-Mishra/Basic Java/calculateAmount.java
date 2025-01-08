import java.util.*;
public class calculateAmount {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        System.out.println("Enter the rate");
        int rate =sc.nextInt();
        System.out.println("Enter the quamtity");
        int quantity = sc.nextInt();

        int amount =0;
        amount = rate*quantity;

        if(amount>2000)
        {
            amount = amount- (15*amount)/100;
            System.out.println("The amount to be paid is " + amount);
        }
        else
        {
            System.out.println("The amount to be paid  is "+ amount);
        }

    }
    
}

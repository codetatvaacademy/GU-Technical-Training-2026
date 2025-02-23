import java.util.*;
public class incometax {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter your early income");
        int income= sc.nextInt();
        int amount =0;
        int tax=0;
        if(income<=10000)
        {
            System.out.println("The required tax you have to pay is "+tax);
        }
        else if(income>10000&&income<=25000)
        {
            amount=income -10000;
            tax= (10*amount)/100;
            System.out.println("The required tax you have to pay is "+tax);
        }
        else if(income>25000&&income<=50000)
        {
            amount = income-25000;
            tax= 2500+ (20*amount)/100;
            System.out.println("The required tax you have to pay is "+tax);
        }
        else 
        {
            amount = income-50000;
            tax = 5000 + (30*amount)/100;
            System.out.println("The required tax you have to pay is "+tax);
        }

    }
    
}

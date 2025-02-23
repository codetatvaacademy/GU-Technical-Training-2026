package Atishay_Jain;

import java.util.*;

public class Discount2000 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  

        System.out.println("Enter rate of product: ");
        float rate=sc.nextFloat();

        System.out.println("Enter quantity: ");
        int quantity=sc.nextInt();

        float price=rate*quantity;
        if(price>2000){
            double newPrice=price * 0.85;
            System.out.print("Total amount to be paid after discount is " + newPrice);
        }
        else{
            System.out.println("Total amount of the products is " + price);
        }
    }
}

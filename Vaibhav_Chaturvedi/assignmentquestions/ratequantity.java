

import java.util.*;
import java.util.Scanner;

public class ratequantity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter rate and quantity");
        int rate = sc.nextInt();
        int quantity = sc.nextInt();
        float amount= rate*quantity;
        if(amount!=0){
        System.out.println("amount is "+amount);
        if(amount>2000){
          amount-=amount*0.15;
          System.out.println("amount is "+amount);
          
        }
    }
    }
}

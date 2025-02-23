//WAP to take input rate & quantity and calculate the amount. 
//Finally print net amount to be paid after allowing 15% discount if amount exceeds 2000 rs.


import java.util.*;
public class PrintNetAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rate: ");
        int rate = sc.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        int totalAmount = rate*quantity;

        if(totalAmount>2000){
            System.out.println("the net amount after 15% disount is: "+(totalAmount-(0.15*totalAmount)));
        }
        else{
            System.out.println("the net amount is: "+totalAmount);
        }

        sc.close();
    }
}

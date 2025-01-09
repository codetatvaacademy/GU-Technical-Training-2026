package Atishay_Jain;

import java.util.*;

public class Reverse {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a nummber: ");
        int num=sc.nextInt();

        int revNum=0;

        while(num!=0){
            int ld=num%10;
            revNum=revNum*10+ld;
            num=num/10;
        }
        System.out.print("The reverse of the number is: "+revNum);
    }
    
}


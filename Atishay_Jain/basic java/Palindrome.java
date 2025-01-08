package Atishay_Jain;

import java.util.*;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a nummber: ");
        int num=sc.nextInt();

        int newNum=num;

        int revNum=0;

        while(num!=0){
            int ld=num%10;
            revNum=revNum*10+ld;
            num=num/10;
        }

        if(newNum==revNum){
            System.out.print("The number is palindrome.");
        }
        else{
            System.out.println("The number is not palindrome.");
        }
    }
}



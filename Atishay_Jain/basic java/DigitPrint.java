package Atishay_Jain;

import java.util.*;

public class DigitPrint {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter four digit number: ");
        int num=sc.nextInt();

        int thou=num/1000;
        System.out.print(thou + " Thousand"+" ");

        thou=num%1000;
        int hun=thou/100;
        System.out.print(hun +" Hundred"+" ");

        hun=thou%100;
        int ten=hun/10;
        System.out.print(ten +" Ten"+" ");

        ten=hun%10;
        int one=ten%10;
        System.out.print(one);
    }
}

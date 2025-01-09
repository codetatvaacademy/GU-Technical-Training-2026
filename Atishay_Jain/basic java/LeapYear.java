package Atishay_Jain;

import java.util.*;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter year: ");
        int year=sc.nextInt();

        if(year%4==0){
            System.out.print("It is a leap year.");
        }
        else{
            System.out.print("It is not a leap year.");
        }
    }
}

package Atishay_Jain;

import java.util.*;

public class Year_Month_Day {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the days: ");
        int days=sc.nextInt();

        int year=days/365;
        days=days%365;
        System.out.print(year + " Years"+" ");

        int month=days/30;
        days=days%30;
        System.out.print(month + " Month"+ " ");

        System.out.println(days+ " Days");

    }
}

package Atishay_Jain;

import java.util.*;

public class SquareOfSecondDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the three digit numbers: ");
        int number=sc.nextInt();

        int m=number%100;
        int n=m/10;
        int square=n*n;
        System.out.println("The square of second digit: "+square);
    }
}

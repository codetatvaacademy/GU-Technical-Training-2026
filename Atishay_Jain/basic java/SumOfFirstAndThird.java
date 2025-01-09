package Atishay_Jain;

import java.util.*;

public class SumOfFirstAndThird {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the three digit number: ");
        int number=sc.nextInt();

        int sum=((number/100)+(number%10));
        System.out.println("Sum of first and last digit: " + sum);
    }
}

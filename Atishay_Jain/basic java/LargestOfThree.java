package Atishay_Jain;

import java.util.*;

public class LargestOfThree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1=sc.nextInt();

        System.out.print("Enter second number: ");
        int num2=sc.nextInt();

        System.out.print("Enter third number: ");
        int num3=sc.nextInt();

        // if(num1>num2){
        //     if(num1>num3){
        //         System.out.print("First number is largest.");
        //     }
        //     else{
        //         System.out.print("Third number is largest.");
        //     }
        // }
        // else{
        //     if(num2>num3){
        //         System.out.print("Second number is largest.");
        //     }
        // }
        if(num1>num2 && num1>num3){
            System.out.print("First number is greater.");
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Second number is greater.");
        }
        else{
            System.out.println("Third number is greater.");
        }
    }
}

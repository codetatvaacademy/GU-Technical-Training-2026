package Atishay_Jain;

import java.util.*;

public class SecondLargest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1=sc.nextInt();

        System.out.print("Enter second number: ");
        int num2=sc.nextInt();

        System.out.print("Enter third number: ");
        int num3=sc.nextInt();

        if(num1>num2 && num1>num3){
            if(num2>num3){
                System.out.print("Second number is second largest number");
            }
            else{
                System.out.print("Third number is second largest number");
            }
        }
        else if(num2>num1 && num2>num3){
            if(num3>num1){
                System.out.print("Third number is second largest number");
            }
            else{
                System.out.print("First number is second largest number");
            }
        }
        else if(num1>num2){
            System.out.print("First number is second largest number");
        }
        else{
            System.out.print("Second number is second largest number");
        }
    }
}
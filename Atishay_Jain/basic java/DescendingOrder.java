package Atishay_Jain;

import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1=sc.nextInt();

        System.out.print("Enter second number: ");
        int num2=sc.nextInt();

        System.out.print("Enter third number: ");
        int num3=sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.print(num1+" ");
            if(num2>num3){
                System.out.print(num2+" ");
                System.out.print(num3+" ");
            }
            else{
                System.out.print(num3+" ");
                System.out.print(num2+" ");
            }
        }
        else if(num2>num1 && num2>num3){
            System.out.print(num2+" ");
            if(num1>num3){
                System.out.print(num1+" ");
                System.out.print(num3+" ");
            }
            else{
                System.out.print(num3+" ");
                System.out.print(num1+" ");
            }
        }
        else{
            System.out.print(num3+" ");
            if(num2>num1){
                System.out.print(num2+" ");
                System.out.print(num1+" ");
            }
            else{
                System.out.print(num1+" ");
                System.out.print(num2+" ");
            }
        }
    }
}

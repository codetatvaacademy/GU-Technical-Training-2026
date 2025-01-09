package Atishay_Jain;

import java.util.*;;

public class LargestOrSmallest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a first number: ");
        int num1=sc.nextInt();

        System.out.println("Enter a second number: ");
        int num2=sc.nextInt();

        if(num1>num2){
            System.out.println(num1+" is largest " + num2 +" is smallest");
        }
        else{
            System.out.println(num2+" is largest "+ num1 +" is smallest");
        }

    }
}

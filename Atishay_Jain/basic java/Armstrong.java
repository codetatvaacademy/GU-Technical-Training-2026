package Atishay_Jain;

import java.util.*;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a nummber: ");
        int num=sc.nextInt();

        int sum=0;
        int digitNumber=String.valueOf(num).length();
        int armNum=num;

        while(num>0){
            int d=num%10;
            sum+=Math.pow(d,digitNumber);
            num/=10;

        }

        if(sum==armNum){
            System.out.print("The number is armstrong.");
        }
        else{
            System.out.println("The number is not armstrong.");
        }
    }
}




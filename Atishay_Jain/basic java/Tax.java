package Atishay_Jain;

import java.util.*;

public class Tax {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the income: ");
        int income=sc.nextInt();

        if(income<=10000){
            System.out.print("No tax");
        }
        else if(income<=25000){
            System.out.print(0.1*income +" This amount of tax has to be paid");
        }
        else if(income<=50000){
            System.out.print((2500+(0.2*income)) +" This amount of tax has to be paid");
        }
        else{
            System.out.print((5000+(0.3*income)) +" This amount of tax has to be paid");
        }
    }
}

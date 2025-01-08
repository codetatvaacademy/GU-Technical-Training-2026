//import java.util.Scanner;
//Question 21
import java.util.*;

public class CalculateTax {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter income:");
        double income=sc.nextDouble();
        double tax=0.0;
        if(income<=250000){
            tax=0;
        }
        else if(income<=500000){
        tax=0.05*(income-250000);
        }
        else if(income<=1000000){
        tax=0.05*250000+0.20*(income-500000);
        }
        else {
            tax=0.05*250000+0.20*500000+0.30*(income-1000000);
        }
        System.out.println("Amount of tax will be applied on given income :"+tax);
        sc.close();
    }

}

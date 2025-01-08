//Question 5
import  java.util.Scanner;
public class ConversionOfDays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of Days:");
        int days=sc.nextInt();
        int years=days/365;
        int months=(days%365)/12;
        int  Days=(days%365)/7;
        System.out.println("No of years:"+years);
        System.out.println("No of months:"+months);
        System.out.println("No of Days:"+Days);
        sc.close();


    }
    
}

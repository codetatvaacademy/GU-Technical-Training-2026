//WAP to input year from user and check whether it is a leap year or not.//
import java.util.Scanner;
public class CheckLeapYear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        if(year%4==0 && year%100!=0){
            System.out.println("The year is leap year:" + year);
        }else{
            System.out.println("The year is not a leap year:" + year);
        }
    }
}
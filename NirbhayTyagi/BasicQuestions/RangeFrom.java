//WAP to take input a number (range 1 to 7) from the user and print the corresponding week using if else
import java.util.Scanner;
public class RangeFrom{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7:");
        int day = sc.nextInt();
        if(day==1){
            System.out.println("sunday");
        }else if(day==2){
            System.out.println("monday");
        }else if(day==3){
            System.out.println("tuesday");
        }else if(day==4){
            System.out.println("wdenesday");
        }else if(day==5){
            System.out.println("thursday");
        }else if(day==6){
            System.out.println("friday");
        }else if (day ==7){
            System.out.println("saturday");
        }else{
            System.out.println("out of range:");
        }
    }
}
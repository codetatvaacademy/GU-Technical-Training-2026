//Question 16
import java.util.*;
public class PrintingSecondLargestNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st  number:");
        int number1=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int number2=sc.nextInt();
        System.out.println("Enter 3rd number:");
        int number3=sc.nextInt();
        //if(number1<number2 && number2<number3 && number1<number3){
           // System.out.println("Number 2 is greater.");;
        //}
         if(number1<number2 && number2>number3) {
            System.out.println("number 2 is largest");
        }
        
    }
    
}

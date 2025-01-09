//Question 14
import java.util.*;
public class PrintingLargestUsingAndOperator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1:");
        int number1=sc.nextInt();
        System.out.println("Enter number2:");
        int number2=sc.nextInt();
        System.out.println("Enter number3:");
        int number3=sc.nextInt();
        if(number1<number2 && number2<number3 && number1<number3){
            System.out.println("Number 3 is greater.");;
        }
        else if(number1<number2 && number2>number3) {
            System.out.println("Number 2 is greater. ");
        }
        else {
            System.out.println("Number 1 is greater");
        }

    }
    
}

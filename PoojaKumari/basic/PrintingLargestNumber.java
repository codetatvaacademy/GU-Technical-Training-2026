//Question 11
import java.util.Scanner;
public class PrintingLargestNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1:");
        int number1=sc.nextInt();
        System.out.println("Enter number2:");
        int number2=sc.nextInt();
        if(number1<number2){
            System.out.println("Number2 is greater.");
        }
        else{
            System.out.println("Number1 is greater.");
        }
        sc.close();
    }
    
}

//Question 10
import java.util.Scanner;
public class CheckingNegativePositiveAndZero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int number=sc.nextInt();
        if(number==0){
            System.out.println("Number is Zero.");
        }
        else if(number<0){
            System.out.println("Number is negative.");
        }
        else{
            System.out.println("Number is positive.");
        }
        sc.close();
    }
    
}

// Question 7
//import java.util.*;
import java.util.Scanner;
public class SquareOfMiddleDigit {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 3 digit number:");
    int number=sc.nextInt();
    //int digit1=number%100;
    int digit2=(number/10)%10;
    //int digit3=number%10;
    int square=(digit2*digit2);
    System.out.println("Sqaure of 2nd digit:"+square);
    sc.close();
    }
    
}

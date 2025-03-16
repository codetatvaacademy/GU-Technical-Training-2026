import java.util.Scanner;
public class Problem07 {
    // WAP to take input 3 digit numbers from the user and print the square of the middle digit.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num=sc.nextInt();

        //Valid or not 
        if(num>=100 && num<=999){
            int middleDigit=(num/10) % 10;
            int square=middleDigit*middleDigit ;
            System.out.println("The square of the middle digit ("+ middleDigit+ ") = " + square );

        } else {
            System.out.println("Enter a valid 3-digit number.");
        }
            
    }
}


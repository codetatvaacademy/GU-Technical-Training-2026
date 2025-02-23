import java.util.Scanner;

public class Problem06 {
    // WAP to take input 3 digit numbers from the user and print sum of 1 and 3 digit
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num=sc.nextInt();

        //Valid or not 
        if(num>=100 && num<=999){
            int firstDigit=num/100 ;
            int thirdDigit= num % 10 ;

            //sum calc
            int sum= firstDigit+thirdDigit ;

            System.out.println("The sum of the first and third digits = " + sum);

        } else {
            System.out.println("Enter a valid 3- digit number.");
        }

    }
    
}

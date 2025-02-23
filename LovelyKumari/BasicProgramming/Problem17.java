import java.util.Scanner;

public class Problem17 {
    //WAP to input year from user and check whether it is a leap year or not.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year=sc.nextInt();

         // Check if the year is a leap year or not 
         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
    }
    
}

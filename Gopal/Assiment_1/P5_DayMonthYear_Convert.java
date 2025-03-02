import java.util.Scanner;

public class P5_DayMonthYear_Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter number of Days :: " );
        int days = sc.nextInt();

        // Change days to year by divide days by 365
        if ( days/365 >= 1 ) {
            System.out.print("Year :: " + days/365);
            days = days%365;
        }
        else {
            System.out.print("Year 0");
        }

        // Change remaning days to month
        System.out.println();
        if ( days/12 >= 1 ) {
            System.out.print("Month :: " + days/12);
            days %= 12 ;
        }
        else {
            System.out.print("Month 0");
        }

        // Print remaning days
        System.out.println();
        System.out.print("Days :: " + days);
    }
}

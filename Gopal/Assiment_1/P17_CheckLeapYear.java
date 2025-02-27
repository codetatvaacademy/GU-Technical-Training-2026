import java.util.Scanner;

public class P17_CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter year ");
        int year = sc.nextInt();

        if ( year % 4 == 0 ) {
            if ( year % 100 == 0 && year % 400 != 0 ) {
                System.out.println("Not leap year");
                return;
            }
            System.out.println("Leap year");
            return;
        }
        System.out.println("Not leap year");
    }
}

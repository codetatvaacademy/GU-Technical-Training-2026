
import java.util.Scanner;

public class P16_PrintDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter number 1 to 7 : ");
        int day = sc.nextInt();

        // Using if condition

//        if ( day < 1 || day > 7 ) {
//            System.out.println("Invalid input :-> Enter 1 to 7 ");
//        }
//        else if ( day == 1 ) {
//            System.out.println("Monday");
//        }
//        else if ( day == 2 ) {
//            System.out.println("Tuesday");
//        }
//        else if ( day == 3 ) {
//            System.out.println("Wednesday");
//        }
//        else if ( day == 4 ) {
//            System.out.println("Thrusday");
//        }
//        else if ( day == 5 ) {
//            System.out.println("Friday");
//        }
//        else if ( day == 6 ) {
//            System.out.println("Saturday");
//        }
//        else {
//            System.out.println("Sunday");
//        }

        // Using Switch case
        switch (day) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thrusday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}

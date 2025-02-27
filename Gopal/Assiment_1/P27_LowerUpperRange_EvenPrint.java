import java.util.Scanner;

public class P27_LowerUpperRange_EvenPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter your lower Limit : ");
        int lower = sc.nextInt();
        System.out.print("Enter your Upper Limit : ");
        int upper = sc.nextInt();

        System.out.print("Even number :: ");
        if ( lower % 2 != 0 ) lower++ ;
        for ( int i = lower  ; i < upper ; i+=2 ) {
            System.out.print(i + " ");
        }
    }
}

import java.util.Scanner;

public class P7_Square_MidleNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter 3 digit  number : ");
        int num = sc.nextInt();

        int square = 1 ; // To store square
        int middle = 0 ; // To track middle number

        while (num != 0 ) {
            int rem = num % 10 ;
            if ( middle == 1 ) {
                System.out.println("Square is :: " + rem*rem);
                return;
            }
            num = num/10;
            middle++ ;
        }
    }
}

import java.util.Scanner;

public class P10_CheckNum_PosNev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter num : ");
        int num = sc.nextInt();

        // Positive if greater than 0
        if ( num > 0 ){
            System.out.println("Positive");
            return;
        }

        // Negative if less than 0
        if ( num < 0 ) {
            System.out.println("Negative");
            return;
        }

        // If both not then 0
        System.out.println("Zero");
    }
}

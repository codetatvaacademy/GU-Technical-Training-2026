import java.util.Scanner;

public class P9_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter num : ");
        int num = sc.nextInt();

        // Check even
        if ( num % 2 == 0 ) {
            System.out.println("Even");
            return;
        }

        // Check Odd by dividing 2
        System.out.println("Odd");
    }
}

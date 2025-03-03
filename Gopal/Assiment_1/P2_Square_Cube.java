import java.util.Scanner;

public class P2_Square_Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : " );
        int num = sc.nextInt();

        // Printing Square
        System.out.print("Square of all number till : " + num + " is :-> ");
        for ( int i = 1 ; i <= num ; i++ ) {
            System.out.print(i*i + " ");
        }

        // Printing Cube
        System.out.println();
        System.out.print("Cube of all number till : " + num + " is :-> ");
        for ( int i = 1 ; i <= num ; i++ ) {
            System.out.print(i*i*i + " ");
        }
    }
}

import java.util.Scanner;

public class P35_3Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        for ( int i = 1 ; i <= num ; i++ ) {
            System.out.print(i);
        }
    }
}

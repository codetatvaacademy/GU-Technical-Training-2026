import java.util.Scanner;

public class P35_5Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int ans = 0 ;

        int a = 0 ;
        int b = 1 ;

        for ( int i = 2 ; i <= num ; i++ ) {
            ans = a + b ;
            a = b ;
            b = ans ;
        }
        System.out.println(ans);
    }
}

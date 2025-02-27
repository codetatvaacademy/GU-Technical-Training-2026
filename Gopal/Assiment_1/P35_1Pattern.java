import java.util.Scanner;

public class P35_1Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter number :: ");
        int num = sc.nextInt();
        int ans = 0 ;

        for ( int i = 1 ; i <= num ; i++) {
            ans += i ;
        }
        System.out.println(ans);
    }
}

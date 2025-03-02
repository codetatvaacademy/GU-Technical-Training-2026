import java.util.Scanner;

public class P35_6Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        if ( num == 0 ){
            System.out.println(0);
            return;
        }
        int ans = 1 ;
        for ( int i = 1 ;  i <= num ; i++ ) {
            ans *= 2 ;
        }
        System.out.println(ans-1);
    }
}

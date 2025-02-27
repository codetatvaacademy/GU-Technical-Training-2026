import java.util.Scanner;

public class P34_CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        String str = String.valueOf(num) ;
        int sum = 0  , i = 0 ;
        while ( i < str.length() ) {
            int n = str.charAt(i) - '0';
            int prodt = 1 ;
            for ( int k = 1 ; k <= str.length() ; k++ ) {
                prodt *= n ;
            }
            sum += prodt ;
            i++ ;
        }
        if ( sum == num ) {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not Armstrong");
        }
    }
}

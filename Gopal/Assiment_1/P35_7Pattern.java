import java.util.Scanner;

public class P35_7Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        if ( num == 0 ) {
            System.out.println(0);
            return;
        }
        int positive = 1 ;
        int negavtive = 1 ;

        for ( int i = 1 ; i <= num ; i++ ) {
            if ( i % 2 != 0 ) {
                int proct = 1 ;
                for ( int j = 1 ; j <= i ; j++ ) {
                    proct *= num;
                }
                positive += proct ;
            }
            else {
                int prodt = 1 ;
                for ( int j = 1 ; j <= i ; j++ ) {
                    prodt *= num ;
                }
                negavtive += prodt ;
            }
        }
        System.out.println(positive-negavtive);
    }
}

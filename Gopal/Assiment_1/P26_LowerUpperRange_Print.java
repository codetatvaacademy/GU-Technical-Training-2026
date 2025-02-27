import java.util.Scanner;

public class P26_LowerUpperRange_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter your lower Limit : ");
        int lower = sc.nextInt();
        System.out.print("Enter your Upper Limit : ");
        int upper = sc.nextInt();

        System.out.print("Range Value :: ");
        for ( int i = lower  + 1 ; i < upper ; i++ ) {
            System.out.print(i + " ");
        }
    }
}

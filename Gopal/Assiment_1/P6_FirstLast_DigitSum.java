import java.util.Scanner;

public class P6_FirstLast_DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter 3 didgit  number :: ");
        int num = sc.nextInt();

        // Calculating sum of first and last digit
        int sum = 0 ;
        int i = 0 ; // To track first and last digit

        while (num != 0 ) {
            int rem = num%10 ;
            if ( i != 1 ){
                sum += rem;
            }
            num = num/10 ;
            i++;
        }

        System.out.println("Sum is :: " + sum);
    }
}

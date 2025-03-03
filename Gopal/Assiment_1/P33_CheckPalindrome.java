import java.util.Scanner;

public class P33_CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter number :: ");
        int num = sc.nextInt();
        int dummyNum = num ;
        int rev = 0 ;

        while ( num != 0 ) {
            int rem = num % 10 ;
            rev = rev * 10 + rem ;
            num /= 10 ;
        }
        if ( rev == dummyNum) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}

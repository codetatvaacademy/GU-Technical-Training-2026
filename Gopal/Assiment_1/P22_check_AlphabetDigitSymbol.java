import java.util.Scanner;

public class P22_check_AlphabetDigitSymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter your character : ");
        String ch = sc.next() ;
        int n = (int) (ch.charAt(0)) ;

        if ( (n >= 97 && n <= 122) || (n >= 65 && n <= 90) ) {
            System.out.println("Alphabet");
        }
        else if ( n >= 48 && n <= 57 ) {
            System.out.println("Number");
        }
        else {
            System.out.println("Symbol");
        }
    }
}

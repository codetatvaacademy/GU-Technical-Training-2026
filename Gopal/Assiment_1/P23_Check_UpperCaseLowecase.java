import java.util.Scanner;

public class P23_Check_UpperCaseLowecase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter Alphabet : ");
        String s = sc.next();

        if ( (int)(s.charAt(0)) >= 96 ) {
            System.out.println("Lower Case Alphabet");
        }
        else {
            System.out.println("Upper Case Alphabet");
        }
    }
}

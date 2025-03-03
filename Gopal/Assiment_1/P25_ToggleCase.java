import java.util.Scanner;

public class P25_ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter Character : ");
        String str = sc.next();

        int n = (int)(str.charAt(0)) ;
        if(n >= 96 ) {
            int actual = n - 97 ;
            int s = 65 + actual ;
            System.out.println((char) (s));
        }
        else {
            int actual = n - 64 ;
            int s = 96 + actual ;
            System.out.println((char) (s));
        }
    }
}

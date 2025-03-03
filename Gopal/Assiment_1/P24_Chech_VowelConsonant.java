import java.util.Scanner;

public class P24_Chech_VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter lowe case Alphabet : ");
        String s = sc.next();
        char c = s.charAt(0);

        if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }
    }
}

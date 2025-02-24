import java.util.Scanner;

public class vowel_consonant {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Character");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        }
        else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }
        }

}

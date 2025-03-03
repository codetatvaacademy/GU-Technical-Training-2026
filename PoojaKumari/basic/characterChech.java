//Question 24
import java.util.Scanner;

public class characterChech {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character:");
        char ch = sc.next().charAt(0);
        if (Character.isAlphabetic(ch)) {
            System.out.println("Given character is alphabet.");
        } else if ( Character.isDigit(ch)) {
            System.out.println("Given character is digit.");
        } else {
            System.out.println("Given character is special symbol.");
        }
        sc.close();
    }

}

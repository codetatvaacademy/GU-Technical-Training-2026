// WAP to input a character from the user and check whether it is uppercase and lowercase.
import java.util.Scanner;

public class UpperLowerCaseChecker {
    public static void checkCase(char ch) {
        if (Character.isUpperCase(ch)) {
            System.out.println("The character is Uppercase.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("The character is Lowercase.");
        } else {
            System.out.println("The character is not a letter.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        checkCase(ch);
        scanner.close();
    }
}

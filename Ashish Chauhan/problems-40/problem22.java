// WAP to input a character from the user and check whether it is an alphabet, digits, or special symbols.
import java.util.Scanner;

public class CharacterChecker {
    public static void checkCharacter(char ch) {
        if (Character.isLetter(ch)) {
            System.out.println("The character is an Alphabet.");
        } else if (Character.isDigit(ch)) {
            System.out.println("The character is a Digit.");
        } else {
            System.out.println("The character is a Special Symbol.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        checkCharacter(ch);
        scanner.close();
    }
}

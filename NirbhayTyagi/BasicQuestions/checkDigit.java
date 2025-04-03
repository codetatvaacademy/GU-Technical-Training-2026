import java.util.Scanner;

public class checkDigit {
    public static String checkCharacterType(char ch) {
        if (Character.isLetter(ch)) {
            return ch + " is an Alphabet.";
        } else if (Character.isDigit(ch)) {
            return ch + " is a Digit.";
        } else {
            return ch + " is a Special Symbol.";
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        System.out.println(checkCharacterType(ch));
    }
}

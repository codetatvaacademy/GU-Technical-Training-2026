// WAP to input a character from user and check whether it is an alphabets, digits, or special symbols.

import java.util.Scanner;

public class characterCheck {
    public static void checkCharacter(String input) {
        if (input.length() != 1) {
            System.out.println("Invalid input! Please enter only a single character.");
            return;
        }

        char ch = input.charAt(0);
        if (Character.isLetter(ch)) {
            System.out.println("Alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Symbol");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String input = scanner.next();
        checkCharacter(input);
        scanner.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)
// WAP to input a character from user and check whether it is uppercase and lowercase.

import java.util.Scanner;

public class caseCheck {
    public static void checkCase(String input) {
        if (input.length() != 1) {
            System.out.println("Invalid input! Please enter only a single character.");
            return;
        }

        char ch = input.charAt(0);
        if (Character.isUpperCase(ch)) {
            System.out.println("Uppercase letter");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("Lowercase letter");
        } else {
            System.out.println("Not an alphabet");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String input = scanner.next();
        checkCase(input);
        scanner.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)
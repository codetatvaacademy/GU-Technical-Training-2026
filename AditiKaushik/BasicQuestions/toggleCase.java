// WAP to convert a character into its toggle case.

import java.util.Scanner;

public class toggleCase {
    public static char toggle_Case(char ch) {
        if (Character.isUpperCase(ch)) {
            return Character.toLowerCase(ch);
        } else if (Character.isLowerCase(ch)) {
            return Character.toUpperCase(ch);
        }
        return ch;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        System.out.println(toggle_Case(ch));

        scanner.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)
// WAP to check whether a character given by user is a vowel or consonant.

import java.util.Scanner;

public class vowelOrConsonant {
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        if (Character.isLetter(ch)) {
            if (isVowel(ch)) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Invalid input! Please enter a single alphabetic character.");
        }

        scanner.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)


import java.util.*;
import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user
        System.out.print("Enter a single character: ");
        String input = sc.nextLine();

        // Ensure the input contains only one character
        if (input.length() == 1) {
            char s = input.charAt(0);

            // Toggle case
            if (s >= 'A' && s <= 'Z') {
                s = (char) (s + 32);
            } else if (s >= 'a' && s <= 'z') {
                s = (char) (s + 32);
            }

            // Print the result
            System.out.println("Toggled character: " + s);
        } else {
            System.out.println("Please enter exactly one character.");
        }

        // Close the scanner
        sc.close();
    }
}


// WAP to input a string from the user and count the number of alphabets, digits & special symbols in the string.

import java.util.Scanner;

class characterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        countCharacters(input);
        
        sc.close();
    }

    static void countCharacters(String input) {
        int alphabets = 0, digits = 0, specialChars = 0;
        
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                alphabets++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                specialChars++;
            }
        }
        
        System.out.println("Alphabets: " + alphabets);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
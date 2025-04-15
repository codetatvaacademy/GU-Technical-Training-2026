// WAP to convert a string into PIGLATIN form.

import java.util.Scanner;

class pigLatinConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        System.out.println(convertToPigLatin(input));
        
        sc.close();
    }

    static String convertToPigLatin(String input) {
        String[] words = input.split(" ");
        StringBuilder pigLatin = new StringBuilder();
        
        for (String word : words) {
            pigLatin.append(convertWordToPigLatin(word)).append(" ");
        }
        
        return pigLatin.toString().trim();
    }

    static String convertWordToPigLatin(String word) {
        char firstChar = Character.toLowerCase(word.charAt(0));
        String vowels = "aeiou";
        
        if (vowels.indexOf(firstChar) != -1) {
            return word + "way";
        } else {
            int vowelIndex = -1;
            for (int i = 0; i < word.length(); i++) {
                if (vowels.indexOf(Character.toLowerCase(word.charAt(i))) != -1) {
                    vowelIndex = i;
                    break;
                }
            }
            
            if (vowelIndex == -1) {
                return word + "ay";
            }
            
            return word.substring(vowelIndex) + word.substring(0, vowelIndex) + "ay";
        }
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)
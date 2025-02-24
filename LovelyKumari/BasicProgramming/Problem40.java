import java.util.Scanner;

public class Problem40 {

    // Method to convert a single word into Pig Latin
    public static String convertToPigLatin(String word) {
        // Define vowels
        String vowels = "aeiouAEIOU";

        if (vowels.indexOf(word.charAt(0)) != -1) {
            // If the word starts with a vowel
            return word + "yay";
        } else {
            // If the word starts with a consonant
            return word.substring(1) + word.charAt(0) + "ay";
        }
    }

    // Method to convert a sentence into Pig Latin
    public static String convertSentenceToPigLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder pigLatinSentence = new StringBuilder();

        for (String word : words) {
            pigLatinSentence.append(convertToPigLatin(word)).append(" ");
        }

        // Remove the trailing space and return
        return pigLatinSentence.toString().trim();
    }

    public static void main(String[] args) {
        // Input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to convert to Pig Latin:");
        String sentence = scanner.nextLine();

        // Convert the sentence to Pig Latin and display the result
        String pigLatinSentence = convertSentenceToPigLatin(sentence);
        System.out.println("Pig Latin form: " + pigLatinSentence);
    }
}

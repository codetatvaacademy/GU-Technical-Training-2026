import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = s.next().toLowerCase();

        String pigLatin = convertToPigLatin(word);
        System.out.println(pigLatin);

        s.close();
    }

    static String convertToPigLatin(String word) {
        int len = word.length();
        int index = -1;

        for (int i = 0; i < len; i++) {
            char ch = word.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                index = i;
                break;
            }
        }

        if (index == -1)
            return word + "ay";
        else if (index == 0)
            return word + "way";
        else
            return word.substring(index) + word.substring(0, index) + "ay";
    }
}

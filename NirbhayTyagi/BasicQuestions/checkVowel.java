import java.util.Scanner;

class checkVowel{
    public static String checkCharacter(char ch){
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else if (Character.isLetter(ch)) {
            return "Consonant";
        } else {
            return "Not a valid alphabet character";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        scanner.close();

        String result = checkCharacter(ch);
        System.out.println("The entered character is a: " + result);
    }
}

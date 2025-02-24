import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char inputChar = sc.next().toLowerCase().charAt(0);
    if (Character.isLetter(inputChar)) {
        if (inputChar == 'a' || inputChar == 'e' || inputChar == 'i' || inputChar == 'o' || inputChar == 'u') {
            System.out.println(inputChar + " is a vowel.");
        } else {
            System.out.println(inputChar + " is a consonant.");
        }
    } else {
        System.out.println("Invalid input. Please enter an alphabet.");
    }
}
}

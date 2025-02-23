import java.util.Scanner;
public class StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int alp = 0, dig = 0, sChar = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                alp++;
            } else if (Character.isDigit(ch)) {
                dig++;
            } else {
                sChar++;
            }
        }
        System.out.println("Alphabets: " + alp);
        System.out.println("Digits: " + dig);
        System.out.println("Special Characters: " + sChar);
    }
}

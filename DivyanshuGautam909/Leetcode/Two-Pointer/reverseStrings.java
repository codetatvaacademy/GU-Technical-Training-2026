import java.util.Scanner;

public class reverseStrings {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char[] s = input.toCharArray();

        scanner.close();

        reverseStrings obj = new reverseStrings();
        obj.reverseString(s);

        System.out.println("Reversed string: " + new String(s));
    }
}

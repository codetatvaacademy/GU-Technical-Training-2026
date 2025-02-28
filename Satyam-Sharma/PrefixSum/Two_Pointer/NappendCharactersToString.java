import java.util.Scanner;

public class NappendCharactersToString {
    public static int appendCharacters(String s, String t) {
        int spointer = 0;
        int tpointer = 0;
        while (spointer < s.length()) {
            if (tpointer == t.length())
                return 0;
            else if (s.charAt(spointer) != t.charAt(tpointer))
                spointer++;
            else {
                spointer++;
                tpointer++;
            }
        }
        return t.length() - tpointer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string s: ");
        String s = sc.nextLine();
        System.out.println("Enter the string t: ");
        String t = sc.nextLine();
        System.out.println(appendCharacters(s, t));
    }
}

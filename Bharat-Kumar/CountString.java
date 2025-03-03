import java.util.Scanner;
public class CountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int alphabets = 0, digits = 0, specialChar = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                alphabets++;
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else {
                specialChar++;
            }
        }
        System.out.println("Alphabets: " +alphabets);
        System.out.println("Digits: " +digits);
        System.out.println("Special Characters: " +specialChar);
        
    }
}

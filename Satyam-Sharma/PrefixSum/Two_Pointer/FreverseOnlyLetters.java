import java.util.Scanner;

public class FreverseOnlyLetters {
    public static String reverseOnlyLetters(String s) {
        char[] res = s.toCharArray();
        int start = 0;
        int end = res.length - 1;
        while (start < end) {
            if (!Character.isLetter(res[start]))
                start++;
            else if (!Character.isLetter(res[end]))
                end--;
            else {
                char temp = res[start];
                res[start] = res[end];
                res[end] = temp;
                start++;
                end--;
            }
        }
        return new String(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println(reverseOnlyLetters(s));
    }
}

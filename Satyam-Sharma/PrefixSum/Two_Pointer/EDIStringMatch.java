import java.util.Scanner;

public class EDIStringMatch {
    public static int[] diStringMatch(String s) {
        int[] res = new int[s.length() + 1];
        int start = 0;
        int end = s.length();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I' || (i == s.length() - 1 && s.charAt(i) == 'I'))
                res[j++] = start++;
            else if (s.charAt(i) == 'D' || (i == s.length() - 1 && s.charAt(i) == 'D'))
                res[j++] = end--;
        }
        if (s.length() - 1 == 'I')
            res[j] = start;
        else
            res[j] = end;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        int[] res = diStringMatch(s);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}

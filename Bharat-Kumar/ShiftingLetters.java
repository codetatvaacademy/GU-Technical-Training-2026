import java.util.*;

public class ShiftingLetters {
    public static String shiftingLetters(String s, int[] shifts) {
        int n = s.length(), totalShift = 0;
        char[] result = s.toCharArray();

        for (int i = n - 1; i >= 0; i--) {
            totalShift = (totalShift + shifts[i]) % 26;
            result[i] = (char) ('a' + (result[i] - 'a' + totalShift) % 26);
        }
        return new String(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int[] shifts = new int[n];

        for (int i = 0; i < n; i++)
            shifts[i] = sc.nextInt();

        System.out.println(shiftingLetters(s, shifts));
        sc.close();
    }
}

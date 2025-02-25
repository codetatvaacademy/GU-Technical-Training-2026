import java.util.Scanner;

public class Dsubstringcontaingallthreeletters {
    public static int numberOfSubstrings(String s) {
        int[] arr = new int[] { -1, -1, -1 };
        int start = 0;
        int count = 0;
        while (start < s.length()) {
            arr[s.charAt(start) - 'a'] = start;
            if (arr[0] >= 0 && arr[1] >= 0 && arr[2] >= 0) {
                count += Math.min(arr[0], Math.min(arr[1], arr[2])) + 1;
            }
            start++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(numberOfSubstrings(s));
    }
}

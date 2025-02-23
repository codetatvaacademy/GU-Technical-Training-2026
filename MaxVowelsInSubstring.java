import java.util.*;

public class MaxVowelsInSubstring {
    public int maxVowels(String s, int k) {
        int n = s.length(), l = 0, r = 0, maxV = 0, vowels = 0;

        while (r < n) {
            if (isVowel(s.charAt(r))) {
                vowels++;
            }
            if (r - l + 1 == k) {
                maxV = Math.max(maxV, vowels);
                if (isVowel(s.charAt(l))) {
                    vowels--;
                }
                l++;
            }
            r++;
        }
        return maxV;
    }

    boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();

        MaxVowelsInSubstring sol = new MaxVowelsInSubstring();
        System.out.println(sol.maxVowels(s, k));

        sc.close();
    }
}

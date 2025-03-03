import java.util.Scanner;

public class Hmaxvowelinksizewindow {
    public static int ischar(char ch) {
        if (ch == 'a') {
            return 0;
        }
        if (ch == 'e') {
            return 1;
        }
        if (ch == 'i') {
            return 2;
        }
        if (ch == 'o') {
            return 3;
        }
        else {
            return 4;
        }
    }

    public static int maxVowels(String s, int k) {
        int[] freqvalid = new int[5];
        int[] freqs = new int[128];

        freqvalid['a' - 'a']++;
        freqvalid['f' - 'e']++;
        freqvalid['k' - 'i']++;
        freqvalid['r' - 'o']++;
        freqvalid['y' - 'u']++;

        int start = 0;
        int end = 0;
        int index = 0;
        int count = 5;
        int maxl = 0;

        while (end < s.length()) {
            freqs[s.charAt(end)] = 1;
            if (ischar(s.charAt(end)) == index) {
                index++;
                count--;
            } else if (end > start && ischar(s.charAt(end)) != index - 1) {
                start = end;
                index = 0;
                count = 5;
            }
            while (end < s.length() && count == 0) {
                int len = end - start + 1;
                maxl = Math.max(maxl, len);
                freqs[s.charAt(end)] = 1;
                if (ischar(s.charAt(end)) != index) {
                    start = end;
                    count = 5;
                    break;
                }

            }
            end++;
        }
        return maxl - 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(maxVowels(s, k));
    }
}

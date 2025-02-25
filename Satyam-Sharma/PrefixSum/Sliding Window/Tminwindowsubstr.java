import java.util.Scanner;

public class Tminwindowsubstr {
    public static String minWindow(String s, String t) {
        int[] t1 = new int[128];
        int[] s1 = new int[128];

        for (int i = 0; i < t.length(); i++) {
            t1[t.charAt(i)]++;
        }
        int count = 0;
        for (int i = 0; i < t1.length; i++) {
            if (t1[i] != 0)
                count++;
        }
        int start = 0;
        int e = 0;
        int si = -1;
        int ei = -1;
        int ml = s.length() + 1;
        while (e < s.length()) {
            s1[s.charAt(e)]++;
            if (s1[s.charAt(e)] == t1[s.charAt(e)])
                count--;
            while (count == 0 && start <= e) {
                s1[s.charAt(start)]--;
                if (ml > e - start + 1) {
                    ml = e - start + 1;
                    si = start;
                    ei = e;
                }
                if (s1[s.charAt(start)] < t1[s.charAt(start)])
                    count++;
                start++;
            }
            e++;
        }
        if (ml == s.length() + 1)
            return "";
        return s.substring(si, ei + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(minWindow(s, t));
    }
}

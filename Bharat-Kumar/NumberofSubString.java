import java.util.*;

public class NumberofSubString {
    public int numberOfSubstrings(String s) {
        int[] count = {0, 0, 0};
        int l = 0, c = 0;

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                count[s.charAt(l) - 'a']--;
                l++;
            }
            c += l;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        NumberofSubString sol = new NumberofSubString();
        System.out.println(sol.numberOfSubstrings(s));
        
        sc.close();
    }
}

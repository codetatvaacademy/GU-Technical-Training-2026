import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnagramsInString {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        int s1[] = new int[128];
        int p1[] = new int[128];
        if (s.length() < p.length())
            return list;
        for (char ch : p.toCharArray()) {
            p1[ch - 'a']++;
        }
        int start = 0, end = 0;
        while (end < s.length()) {
            s1[s.charAt(end) - 'a']++;
            if (end - start + 1 > p.length()) {
                s1[s.charAt(start) - 'a']--;
                start++;
            }
            if (end - start + 1 == p.length() && Arrays.equals(s1, p1)) {
                list.add(start);
            }
            end++;
        }
        return list;
   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String p = sc.nextLine();
    AnagramsInString as = new AnagramsInString();
    List<Integer> result = as.findAnagrams(s, p);

    System.out.println(result);
   }
}

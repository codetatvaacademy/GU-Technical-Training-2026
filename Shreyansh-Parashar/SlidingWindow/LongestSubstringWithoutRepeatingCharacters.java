import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        int[] map = new int[128];

        while(end < s.length()){
            char c = s.charAt(end); 
            start = Math.max(start, map[c]); 
            maxLength = Math.max(maxLength, end - start + 1);
            map[c] = end + 1;
            ++end;

        }
        return maxLength;
    }
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String 's' : ");
        String s = sc.nextLine();

        int maxLength = obj.lengthOfLongestSubstring(s);

        System.out.println(maxLength);
    }
}

import java.util.Scanner;

public class longestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int[] index = new int[128];
        int maxLength = 0;

        while (end < s.length()) {
            int current = s.charAt(end);
            start = Math.max(start, index[current]);
            maxLength = Math.max(maxLength, end - start + 1);
            index[current] = end + 1;
            end++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        scanner.close();

        longestSubstringWithoutRepeatingCharacters obj = new longestSubstringWithoutRepeatingCharacters();
        int result = obj.lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }
}

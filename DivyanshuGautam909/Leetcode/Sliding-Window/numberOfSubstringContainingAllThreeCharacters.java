import java.util.Scanner;

public class numberOfSubstringContainingAllThreeCharacters {
    public int numberOfSubstrings(String s) {
        int start = 0;
        int end = 0;
        int count = 0;
        int n = s.length();
        int[] freq = new int[3];

        while (end < n) {
            freq[s.charAt(end) - 'a']++;
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                count += n - end;
                freq[s.charAt(start) - 'a']--;
                start++;
            }
            end++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (containing only 'a', 'b', 'c'): ");
        String s = scanner.nextLine();
        scanner.close();

        numberOfSubstringContainingAllThreeCharacters obj = new numberOfSubstringContainingAllThreeCharacters();
        int result = obj.numberOfSubstrings(s);
        System.out.println("Number of substrings containing all three characters: " + result);
    }
}

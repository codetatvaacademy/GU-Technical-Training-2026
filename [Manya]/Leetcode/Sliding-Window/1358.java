import java.util.Scanner;

class Solution {
    public int numberOfSubstrings(String s) {
        int count[] = {0, 0, 0};
        int left = 0;
        int result = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'a']++;

            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                result += s.length() - right;
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String s = scanner.next();

        Solution solution = new Solution();
        int result = solution.numberOfSubstrings(s);
        
        System.out.println("Number of substrings containing 'a', 'b', and 'c': " + result);

        scanner.close();
    }
}

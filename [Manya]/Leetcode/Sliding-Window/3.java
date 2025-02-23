import java.util.Scanner;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[128];
        int start = 0;
        int maxLength = 0;
        int end = 0; 

        while (end < s.length()) {
            int current = s.charAt(end);
            start = Math.max(index[current], start);
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

        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring(s);

        System.out.println("Length of longest substring without repeating characters: " + result);
        
        scanner.close();
    }
}

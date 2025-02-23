import java.util.Scanner;

class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int start = 0, end = 0, cost = 0, maxLength = 0;
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        while (end < s1.length) {
            cost += Math.abs(s1[end] - t1[end]);

            while (cost > maxCost) {
                cost -= Math.abs(s1[start] - t1[start]);
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string (s): ");
        String s = scanner.nextLine();

        System.out.print("Enter second string (t): ");
        String t = scanner.nextLine();

        System.out.print("Enter max cost: ");
        int maxCost = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.equalSubstring(s, t, maxCost);

        System.out.println("Maximum length of the valid substring: " + result);

        scanner.close();
    }
}

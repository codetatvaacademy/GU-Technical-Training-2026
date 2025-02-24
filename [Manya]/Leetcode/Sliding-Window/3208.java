import java.util.Scanner;

class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int count = 0;
        int validLength = 0;

        for (int i = 0; i < n * 2; i++) {
            if (colors[i % n] != colors[(i - 1 + n) % n]) {
                validLength++;
            } else {
                validLength = 1;
            }

            if (validLength >= k && i >= n) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in the colors array: ");
        int n = scanner.nextInt();

        int[] colors = new int[n];
        System.out.println("Enter the elements of the colors array:");
        for (int i = 0; i < n; i++) {
            colors[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.numberOfAlternatingGroups(colors, k);

        System.out.println("Number of alternating groups of length at least k: " + result);

        scanner.close();
    }
}

import java.util.Scanner;

class Solution {
    public static int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        if (n < 3) return 0;

        int count = 0;
        for (int i = 0; i < n; i++) {
            int first = colors[i];
            int second = colors[(i + 1) % n];
            int third = colors[(i + 2) % n];

            if (first != second && second != third) {
                count++;
            }
        }
        return count;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the colors array: ");
        int n = scanner.nextInt();
        
        if (n < 3) {
            System.out.println("The array must have at least 3 elements.");
            return;
        }

        int[] colors = new int[n];

        System.out.println("Enter the colors array elements:");
        for (int i = 0; i < n; i++) {
            colors[i] = scanner.nextInt();
        }

        int result = numberOfAlternatingGroups(colors);
        System.out.println("Number of alternating groups: " + result);
        
        scanner.close();
    }
}

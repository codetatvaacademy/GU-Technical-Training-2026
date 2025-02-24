import java.util.Scanner;

public class alternatingGroup2 {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int start = 0;
        int end = 1;
        int count = 0;
        int n = colors.length;

        while (end < n * 2) {
            if (colors[end % n] != colors[(end - 1) % n]) {
                if ((end - start + 1) == k) {
                    count++;
                    start++;
                }
            } else {
                start = end;
            }

            if (end == n - 1)
                count = 0;

            end++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] colors = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            colors[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        scanner.close();

        alternatingGroup2 obj = new alternatingGroup2();
        int result = obj.numberOfAlternatingGroups(colors, k);

        System.out.println("Number of alternating groups of length " + k + ": " + result);
    }
}

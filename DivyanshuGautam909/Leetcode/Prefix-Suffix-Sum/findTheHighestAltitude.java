import java.util.*;

class Solution {
    public int largestAltitude(int[] gain) {
        int[] alt = new int[gain.length + 1];
        alt[0] = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < alt.length; i++) {
            alt[i] = gain[i - 1] + alt[i - 1];
        }
        for (int i = 0; i < alt.length; i++) {
            max = Math.max(max, alt[i]);
        }
        return max;
    }
}

public class findTheHighestAltitude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in gain array: ");
        int n = scanner.nextInt();
        int[] gain = new int[n];

        System.out.println("Enter the elements of gain array:");
        for (int i = 0; i < n; i++) {
            gain[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int highestAltitude = solution.largestAltitude(gain);

        System.out.println("The highest altitude reached: " + highestAltitude);

        scanner.close();
    }
}

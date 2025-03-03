import java.util.*;

class Solution {
    private boolean isPossible(int[] position, int m, int mid) {
        int ball = m - 1;
        int firstPos = position[0];

        for (int i = 0; i < position.length; i++) {
            if (position[i] - firstPos >= mid) {
                ball--;
                firstPos = position[i];
                if (ball == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        int min = 1;
        int max = position[n - 1] - position[0];

        while (min <= max) {
            int mid = (min + max) / 2;

            if (isPossible(position, m, mid)) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return max;
    }
}

public class MagneticForceBetweenTwoBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of positions: ");
        int n = scanner.nextInt();
        int[] position = new int[n];

        System.out.println("Enter the positions:");
        for (int i = 0; i < n; i++) {
            position[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of balls: ");
        int m = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.maxDistance(position, m);

        System.out.println("The maximum possible distance is: " + result);

        scanner.close();
    }
}

import java.util.*;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int[][] strength = new int[m][2];

        for (int i = 0; i < m; i++) {
            strength[i][0] = countSoldiers(mat[i]);
            strength[i][1] = i;
        }

        Arrays.sort(strength, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = strength[i][1];
        }

        return result;
    }

    private int countSoldiers(int[] row) {
        int left = 0, right = row.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (row[mid] == 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public void userInput() {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();

        int[] result = kWeakestRows(mat, k);
        System.out.println(Arrays.toString(result));

        scanner.close();
    }
}

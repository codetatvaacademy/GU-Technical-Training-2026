
public class Solution {

    public static int maxDistance(int[] positions, int m) {
        int n = positions.length;
        Arrays.sort(positions);

        int low = 1, high = positions[n - 1] - positions[0];
        int answer = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (canWePlace(positions, mid, m)) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return answer;
    }

    public static boolean canWePlace(int[] positions, int dist, int m) {
        int n = positions.length;
        int countBalls = 1;
        int lastPosition = positions[0];

        for (int i = 1; i < n; i++) {
            if (positions[i] - lastPosition >= dist) {
                countBalls++;
                lastPosition = positions[i];
            }
            if (countBalls >= m)
                return true;
        }
        return false; //
    }

}
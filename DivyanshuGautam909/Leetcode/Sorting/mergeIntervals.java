package Sorting;

import java.util.*;

public class mergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (interval1, interval2) -> interval1[0] - interval2[0]);

        int end = intervals[0][1];
        List<int[]> ans = new ArrayList<>();

        for (int i = 0, j = 1; j <= intervals.length; j++) {
            if (j == intervals.length || intervals[j][0] > end) {
                ans.add(new int[] { intervals[i][0], end });
                i = j;
            }
            if (j != intervals.length) {
                end = Math.max(end, intervals[j][1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of intervals: ");
        int n = scanner.nextInt();
        int[][] intervals = new int[n][2];

        System.out.println("Enter the intervals (start and end):");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = scanner.nextInt();
            intervals[i][1] = scanner.nextInt();
        }

        scanner.close();

        mergeIntervals obj = new mergeIntervals();
        int[][] result = obj.merge(intervals);

        System.out.println("Merged intervals:");
        for (int[] interval : result) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }
}

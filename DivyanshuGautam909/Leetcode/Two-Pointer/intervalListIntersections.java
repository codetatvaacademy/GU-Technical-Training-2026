import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class intervalListIntersections {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i = 0;
        int j = 0;
        List<int[]> answer = new ArrayList<>();

        while (i < firstList.length && j < secondList.length) {
            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);

            if (start <= end) {
                answer.add(new int[] { start, end });
            }
            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }

        return answer.toArray(new int[answer.size()][]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of intervals in the first list: ");
        int n = scanner.nextInt();
        int[][] firstList = new int[n][2];
        System.out.println("Enter the intervals for the first list:");
        for (int i = 0; i < n; i++) {
            firstList[i][0] = scanner.nextInt();
            firstList[i][1] = scanner.nextInt();
        }

        System.out.print("Enter the number of intervals in the second list: ");
        int m = scanner.nextInt();
        int[][] secondList = new int[m][2];
        System.out.println("Enter the intervals for the second list:");
        for (int i = 0; i < m; i++) {
            secondList[i][0] = scanner.nextInt();
            secondList[i][1] = scanner.nextInt();
        }

        scanner.close();

        intervalListIntersections obj = new intervalListIntersections();
        int[][] result = obj.intervalIntersection(firstList, secondList);

        System.out.println("Intersecting intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}

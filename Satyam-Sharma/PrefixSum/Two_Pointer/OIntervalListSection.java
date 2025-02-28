import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OIntervalListSection {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i = 0;
        int j = 0;
        List<int[]> ans = new ArrayList<>();
        while (i < firstList.length && j < secondList.length) {
            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);
            if (start <= end) {
                ans.add(new int[] { start, end });
            }
            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }
        return ans.toArray(new int[ans.size()][2]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of intervals in the first list: ");
        int n = sc.nextInt();
        int[][] firstList = new int[n][2];
        System.out.println("Enter the intervals of the first list: ");
        for (int i = 0; i < n; i++) {
            firstList[i][0] = sc.nextInt();
            firstList[i][1] = sc.nextInt();
        }
        System.out.println("Enter the number of intervals in the second list: ");
        int m = sc.nextInt();
        int[][] secondList = new int[m][2];
        System.out.println("Enter the intervals of the second list: ");
        for (int i = 0; i < m; i++) {
            secondList[i][0] = sc.nextInt();
            secondList[i][1] = sc.nextInt();
        }
        OIntervalListSection obj = new OIntervalListSection();
        int[][] res = obj.intervalIntersection(firstList, secondList);
        System.out.println("The intersection of the two lists is: ");
        for (int i = 0; i < res.length; i++) {
            System.out.print("[");
            for (int j = 0; j < 2; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.print("]");
        }
        
    }
}

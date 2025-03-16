import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntervalListIntersections {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> list = new ArrayList<>();
        int i=0,j=0;
        while(i<firstList.length && j<secondList.length){
                int start = Math.max(firstList[i][0],secondList[j][0]);
                int end = Math.min(firstList[i][1],secondList[j][1]);
                if(start<=end){
                    list.add(new int[]{start,end});
                }
                if(firstList[i][1]<secondList[j][1]){
                    i++;
                }else{
                    j++;
                }
            }
            return list.toArray(new int[list.size()][]);
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] firstList = new int[n][2];
        for (int i = 0; i < n; i++) {
            firstList[i][0] = sc.nextInt();
            firstList[i][1] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[][] secondList = new int[m][2];
        for (int i = 0; i < m; i++) {
            secondList[i][0] = sc.nextInt();
            secondList[i][1] = sc.nextInt();
        }

        IntervalListIntersections ii = new IntervalListIntersections();
        int[][] result = ii.intervalIntersection(firstList, secondList);

        for (int[] interval : result) {
            System.out.println(interval[0] + ", " + interval[1] );
        }
    }
}

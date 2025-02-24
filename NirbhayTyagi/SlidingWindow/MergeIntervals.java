import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeIntervals{
    public static int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        int end = intervals[0][1];
        ArrayList<int[]>answer=new ArrayList<>();

        for(int i = 0, j = 1; j <= intervals.length; j++){
            if(j == intervals.length || intervals[j][0] > end){
                answer.add(new int[] {intervals[i][0], end});
                i = j;
            }
            if(j != intervals.length){
                end = Math.max(end, intervals[j][1]);
            }
        }

        return answer.toArray(new int[answer.size()][]);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        int[][] intervals = new int[row][2];
        System.out.println("Enter the intervals (start and end):");
        for (int i = 0; i < row; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        int[][] answer = merge(intervals);
        System.out.print("[");
        for(int i = 0; i < answer.length; i++){
            System.out.print("[" + answer[i][0] + ", " + answer[i][1] + "]");
        }
        System.out.println("]");
    }
}

//time complexity of the function is: O(nlogn)
//space complexity of the function is:O(n)

//time complexity of the whole program is:O(nlogn)+O(n) = O(nlogn)
//space complexity of the whole program is:O(n)

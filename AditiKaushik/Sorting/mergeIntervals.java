// 56. Merge Intervals

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class mergeIntervals{
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];
        
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[][] intervals = new int[size][2];
        for (int i = 0; i < intervals.length; i++) {
            System.out.println("Enter the start of interval: ");
            intervals[i][0] = sc.nextInt();
            System.out.println("Enter the end of interval: ");
            intervals[i][1] = sc.nextInt();
        }
        System.out.println(merge(intervals));
        sc.close();
    }
}

//Time Complexity: O(nlogn)
//Space Complexity: O(n)
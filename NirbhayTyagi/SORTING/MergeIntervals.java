import java.util.ArrayList;
import java.util.Arrays;

class MergeIntervals{
    public int[][] merge(int[][] intervals) {        
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
    
}
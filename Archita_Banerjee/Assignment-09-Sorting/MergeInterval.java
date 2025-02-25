import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (interval1, interval2)->interval1[0]-interval2[0]);
        int end= intervals[0][1];
        List<int[]> ans= new ArrayList<>();
        for(int j=0,i=1;i<=intervals.length;i++){
            if(i==intervals.length||intervals[i][0]>end){
                ans.add(new int[]{intervals[j][0], end});
                j=i;
            }
            if(i!=intervals.length){
                end= Math.max(end, intervals[i][1]);
            }
        }
        return ans.toArray (new int[ans.size()][]);
    }
}

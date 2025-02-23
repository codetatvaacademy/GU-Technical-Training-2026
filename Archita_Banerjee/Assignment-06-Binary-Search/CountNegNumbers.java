public class CountNegNumbers {
    public int countNegatives(int[][] grid) {
        int cnt=0;
        for(int[]row:grid){
            cnt+= countNinRows(row);
        }
        return cnt;
    }
    public int countNinRows(int []rows){
        int low=0 ;
        int high=rows.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(rows[mid]<0){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return rows.length-low;
    }
}

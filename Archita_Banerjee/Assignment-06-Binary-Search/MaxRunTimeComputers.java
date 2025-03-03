import java.util.Arrays;
public class MaxRunTimeComputers {
    public long maxRunTime(int n, int[] batteries) {
        Arrays.sort(batteries);
        long min=batteries[0];

        long sum=0;
        for(int i=0;i<batteries.length;i++){
            sum+= batteries[i];
        }
        long max= sum/n;
        while(min<=max){
            long mid=(max+min)/2;
            if(isValid(mid, batteries, n)){
                min=mid+1;
            }else{
                max=mid-1;
            }
        }
        return max;
    }
    public static boolean isValid(long mid, int[]arr, int n){
        long avl = 0;
        long req= mid*n;
        for(int i=0;i<arr.length;i++){
            avl+=Math.min(mid,arr[i]);
        }
        return avl>=req;
    }
}

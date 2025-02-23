import java.util.Arrays;
public class MagneticForceBetweenBalls {
    public static boolean isPossible(int mid,int[] arr, int m) {
        int f_ball=arr[0];
        m--;

        for(int i=1;i<arr.length;i++){
            if(arr[i]-f_ball>=mid){
                m--;
                f_ball=arr[i];
            }
        }
        return m<=0;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int min=1;
        int max=position[position.length-1]-position[0];
        while(min<=max){
            int mid=(min+max)/2;
            if((isPossible(mid,position,m))){
                min=mid+1;
            }else{
                max=mid-1;
            }
        }
        return max;
    }
}

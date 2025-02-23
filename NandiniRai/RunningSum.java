
import java.util.*;
public class RunningSum { 
    public static int[] runningSum(int arr[]){
        int pre[] = new int[arr.length];
        pre[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            pre[i]=pre[i-1]+arr[i];
        }
        return pre;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
         for(int i=0;i<arr.length;i++){
          arr[i] = sc.nextInt();
         }
         RunningSum rs = new RunningSum();
        int result[]=rs.runningSum(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}


import java.util.Arrays;

public class MostProfitAssignWork {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxP=0;
        int [][] arr= new int[profit.length][2];
        for(int i=0;i<arr.length;i++){
            arr[i][0]= difficulty[i];
            arr[i][1]= profit[i];
        }
        Arrays.sort(arr, (a,b)-> a[0]-b[0]);
        for(int i=1;i<arr.length;i++){
            arr[i][1]= Math.max(arr[i][1], arr[i-1][1]);
        }
        for(int i=0;i<worker.length;i++){
            int index= binarySearch(arr, worker[i]);
            maxP += index==-1?0:arr[index][1];
        }
        return maxP;
    }
    private static int binarySearch(int [][]arr,int searchEl){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid= (end+start)/2;
            if(arr[mid][0]<=searchEl){
                start= mid+1;
            }else{
                end=mid-1;
            }
        }
        return end;
    }
}

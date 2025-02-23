import java.util.Scanner;
class MinimumValueStepByStepSum{
     public static int minimumValueSum(int arr[]){
        int pre[] = new int[arr.length];
        int minSum =0;
        pre[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            pre[i] = pre[i-1]+arr[i];
            minSum = Math.min(minSum,pre[i]);
        }
        return 1-minSum;
     }
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int arr[] = new int[n];
     for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
     }
     MinimumValueStepByStepSum ms = new MinimumValueStepByStepSum();
     System.out.println(ms.minimumValueSum(arr));
    }
}
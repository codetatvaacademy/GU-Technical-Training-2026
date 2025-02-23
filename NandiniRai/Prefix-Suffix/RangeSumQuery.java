import java.util.Scanner;

class RangeSumQuery{
    static int pre[];
     public static void querySum(int arr[]){
         pre = new int[arr.length];
        pre[0] = arr[0];
        for(int i=0;i<arr.length;i++){
            pre[i] = pre[i-1]+arr[i];
        }
     }
     public static int sumRange(int left, int right){
        if(left==0)
        return pre[right];
        return pre[right]-pre[left-1];
     }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        RangeSumQuery rs = new RangeSumQuery();
        int query = sc.nextInt();
        for(int i=0;i<query;i++){
           int left = sc.nextInt();
           int right = sc.nextInt();
           System.out.println(rs.sumRange(left,right));
        }
     }
}
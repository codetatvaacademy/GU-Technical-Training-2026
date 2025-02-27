import java.util.Scanner;

public class KthMissingNumber {
        public int findKthPositive(int[] arr, int k) {
            int min =0;
            int max = arr.length-1;
            while(min<=max){
                int mid = (min+max)/2;
                int missing = arr[mid] -(mid+1);
                if(missing<k){
                    min = mid+1;
                }
                else{
                    max=mid-1;
                }
            }
            return min+k;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        KthMissingNumber kn = new KthMissingNumber();
        int result = kn.findKthPositive(arr, k);
        System.out.println(result);
    }
}

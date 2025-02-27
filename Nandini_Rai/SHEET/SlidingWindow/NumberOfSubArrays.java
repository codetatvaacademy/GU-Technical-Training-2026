import java.util.Scanner;
public class NumberOfSubArrays {
        public int numOfSubarrays(int[] arr, int k, int threshold) {
            int start = 0;
            int end = 0;
            int sum = 0;
            int count = 0;
            int requiredSum = k * threshold;
            while (end < arr.length) {
                sum += arr[end];
                int length = end - start + 1;
                if (length == k) {
                    if (sum >= requiredSum) {
                        count++;
                    }
                    sum -= arr[start];
                    start++;
                }
                end++;
            }
            return count;
        }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
           arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int threshold = sc.nextInt();
        NumberOfSubArrays ns = new NumberOfSubArrays();
        System.out.println(ns.numOfSubarrays(arr,k,threshold));
       }
}

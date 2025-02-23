import java.util.Scanner;

public class MissingPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();
        System.out.println(findKthPositive(arr, k));
    }
    private static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]-mid-1<k){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start+k;
    }
}

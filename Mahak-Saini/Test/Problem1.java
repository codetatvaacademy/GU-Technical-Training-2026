import java.util.*;
public class Problem1{

    public static int findMiddleIndex(int arr[]){

        // SC = Declaring 2 array of size+2 so = approx O(size)
        // TC = traversing the array approx = O(size)
        int prefixSum[] = new int[arr.length+2];
        int suffixSum[] = new int[arr.length+2];
        int length = prefixSum.length-1;
        prefixSum[0] = suffixSum[0] = 0;
        prefixSum[length] = suffixSum[length] = 0;

        for(int i = 0; i<arr.length; i++){
            prefixSum[i+1] = prefixSum[i] + arr[i];
        }
        for(int i = arr.length-1; i >= 0; i--){
            suffixSum[i+1] = suffixSum[i+2] + arr[i];
        }

        for(int i = 1; i<prefixSum.length-1; i++){
            if(prefixSum[i-1] == suffixSum[i+1]){
                return i-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int midInd = findMiddleIndex(arr);
        System.out.println(midInd);
        sc.close();
    }
}
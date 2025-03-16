public class RevArray {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {3,4,5,6,7};
        revArr(arr,0,n-1);
        printArr(arr, n);

    }
    static void revArr(int arr[], int start, int end){
        if(start<end){
            int temp= arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            revArr(arr, start+1, end-1);
        }
    }
    static void printArr(int[]arr, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}

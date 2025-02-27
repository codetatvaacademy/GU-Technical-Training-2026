public class BubbleSort {
    public static void main(String[] args) {

        int arr[] = {12,45,7,987,9,876};
        int n = arr.length;

        bubbleSort(arr,n);

    }
    static void bubbleSort(int arr[], int n){
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j <= i-1; j++) {
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
        System.out.println("Final array after bubble sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

        }

    }
}

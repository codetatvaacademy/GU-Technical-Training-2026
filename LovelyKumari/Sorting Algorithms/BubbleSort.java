import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int arr[] , int n){
        for(int i=n-1 ; i>=0 ; i--){
            int didSwap=0;
            for(int j=0; j <= i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didSwap=1;
                }
            }
            if(didSwap == 0) break ;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int [] arr = new int[n];

        System.out.print("Enter " + n + " elements: " );
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr , n);
        System.out.print("Sorted array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    } 
}

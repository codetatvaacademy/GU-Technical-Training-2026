import java.util.Scanner;
public class SelectionSort {
    public static void selectionSort(int [] arr , int n){
        for(int i=0 ; i < n-2; i++){
            int mini=i;
            for(int j=i ; j<=n-1 ; j++){
                if(arr[j] < arr[mini]) mini=j;
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]= temp;
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

        selectionSort(arr , n);

        System.out.print("Sorted array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}


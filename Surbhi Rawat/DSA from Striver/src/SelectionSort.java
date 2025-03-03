import java.awt.*;
import java.net.StandardSocketOptions;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {

        int n = 5;
        int arr[] = {12,45,7,987,9,876};

        selectionSort(arr,n);


        }

    static void selectionSort(int arr[], int n){
        for(int i=0; i<n-1;i++){
            int min = i;
            for(int j=i; j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[min];
            arr[min]= temp;
        }
        System.out.println("final array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");


        }
        System.out.println();


    }
}

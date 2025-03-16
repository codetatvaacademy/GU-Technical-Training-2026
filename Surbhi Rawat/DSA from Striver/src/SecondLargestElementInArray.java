import java.util.Scanner;

public class SecondLargestElementInArray {
    public static int[] getSecondOrderElements(int n, int []a) {
        int slargest = findSlargest(a, n);
        int ssmallest = findSsmallest(a, n);

        int arr[] = {slargest, ssmallest};
        return arr;
        // Write your code here.
    }
    static int findSlargest(int a[], int n){
        int largest = a[0];
        int slargest = -1;
        for(int i = 0; i<n; i++){
            if (a[i]>largest){
                slargest = largest;
                largest= a[i];
            }
            else if(a[i]<largest && a[i]>slargest){
                slargest = a[i];
            }
        }
        return slargest;
    }
    static int findSsmallest(int a[], int n){
        int smallest = a[0];
        int ssmallest= Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if (a[i]<smallest){
                ssmallest = smallest;
                smallest = a[i];
            }
            else if(a[i]!=smallest && a[i]<ssmallest){
                ssmallest=a[i];
            }


        }
        return ssmallest;
    }
}

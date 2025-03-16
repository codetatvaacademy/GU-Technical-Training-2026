import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PancakeSorting {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> flip = new ArrayList<>();
         for(int size = arr.length;size>1;size--){
            int maxIndex = findIndex(arr,size);
            if(maxIndex ==size-1 ){
                continue;
            }
            if(maxIndex!=0){
              flipArr(arr,maxIndex+1);
              flip.add(maxIndex+1);
            }
            flipArr(arr,size);
            flip.add(size);
         }
        return flip;
    }
    public void flipArr(int arr[] , int k ){
        int left =0;
        int right =k-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public int findIndex(int arr[],int size){
        int maxIndex =0;
        for(int i=0;i<size;i++){
            if(arr[i]>arr[maxIndex]){
                maxIndex =i;
            }
        }
        return maxIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       PancakeSorting pc = new PancakeSorting();
        List<Integer> result = pc.pancakeSort(arr);

        System.out.println(result);
         System.out.println(Arrays.toString(arr));

    }
}

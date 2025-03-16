import java.util.Arrays;
import java.util.Scanner;

public class MaximumElementAfterDecreamentandReaarange {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0] =1;
        for(int i=1;i<arr.length;i++){
           if(arr[i]>arr[i-1]+1){
            arr[i] = arr[i-1]+1;
           }
        }
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int nums[] = new int[n];
    for(int i=0;i<nums.length;i++){
        nums[i] = sc.nextInt();
    }
    MaximumElementAfterDecreamentandReaarange md = new MaximumElementAfterDecreamentandReaarange();
    System.out.println(md.maximumElementAfterDecrementingAndRearranging(nums));
   }
}

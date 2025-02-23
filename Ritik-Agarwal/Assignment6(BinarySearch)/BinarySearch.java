import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[n] = sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();
        System.out.println(search(arr, target));
    }
    private static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start= mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}

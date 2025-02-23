import java.util.Scanner;

public class SpecialArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[n] = sc.nextInt();
        }
        sc.close();
        System.out.println(specialArray(arr));
    }
    private static int specialArray(int[] nums) {
        int end = nums[0];
        for(int i:nums){
            end = Math.max(i, end);
        }
        int start = 0;
        while(start<=end){
            int mid = (start+end)/2;
            int count = freqOfMid(nums, mid);
            if(count==mid){
                return mid;
            }
            else if(count>mid){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    private static int freqOfMid(int[] nums, int mid){
        int i = nums.length-1;
        int count = 0;
        while(i>=0){
            if(nums[i--]>=mid){
                count++;
            }
        }
        return count;
    }
}
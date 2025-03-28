import java.util.Arrays;
import java.util.Scanner;

class MaximumSumObtainedofAnyPermutation{
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        Arrays.sort(nums);
        long maxSum = 0;
        int[] arr = new int[nums.length];
        for (int[] request : requests) {
            arr[request[0]] += 1;
            if (request[1] + 1 < nums.length) {
                arr[request[1] + 1] += -1;
            }          
        }
        for(int i = 1; i < arr.length; i++){
            arr[i] += arr[i - 1];
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            maxSum += (long) nums[i] * arr[i];
        }
        return (int) (maxSum % 1_000_000_007);        
    }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements of the array:");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter the elements of the array:");
            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();            
            }
            System.out.println("");
            System.out.println("the triplets are:" + threeSum(nums));
    }
}
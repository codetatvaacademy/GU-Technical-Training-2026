
import java.util.Arrays;
import java.util.Scanner;

public class problem3{
    public static int largestSum(int N, int[] nums){
        Arrays.sort(nums);
        int sum1 = 0; 
        int sum2 = 0;
        int start = 0;
        int end = nums.length -1;
        int mid = start + (end - start) / 2;
        for(int i = 0 ; i <= mid; i++){
            sum1 += nums[i];
        }
        for(int i = mid + 1; i <  nums.length; i++){
            sum2 += nums[i];
        }
        return Math.max(sum1, sum2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(largestSum(N, nums));
        sc.close();
    }
}

//time complexity of the function : O(n)
//space complexity of the function : o(1)

//time complexity of the whole program : O(n)
//space complexity of the whole program : O(N)
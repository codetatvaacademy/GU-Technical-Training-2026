import java.util.Arrays;
import java.util.Scanner;
public class RunningSumOf1dArray{
    public static  int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            sum[i] = sum[i-1] + nums[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements array:");
        for(int i = 0 ; i < n ; i ++){
            nums[i] = sc.nextInt();
        } 
        System.out.println("The running sum of the 1d array is:" + Arrays.toString(runningSum(nums)));
    }
}
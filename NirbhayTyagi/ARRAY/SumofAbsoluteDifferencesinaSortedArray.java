import java.util.Arrays;
import java.util.Scanner;

class SumofAbsoluteDifferencesinaSortedArray{
    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        for (int i = 0; i < n; ++i) {
            result[i] = i * nums[i] - prefixSum[i] + (prefixSum[n] -  prefixSum[i] - (n - i) * nums[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Eneter the elements of array");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("The result array is " + Arrays.toString(getSumAbsoluteDifferences(nums)));
    }
}
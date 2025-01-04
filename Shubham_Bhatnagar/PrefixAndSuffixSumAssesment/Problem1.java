// write a java program to find the pivot element of an array using prefix sum.
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int perfect = findWeight(nums, n);
        System.out.println("Output: "+perfect);
    }

    public static int findWeight(int[] arr, int n) {
        
        // Applying PrefixSum method.
        int[] prefixSum = new int[n + 1];
        prefixSum[0] = 0;

        // iterating through the elements till the end of the array.
        for (int i = 1; i <= n; i++) {

            // Adding elements in prefixSum array.
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }
        for (int i = 0; i < n; i++) {

            // chcking if i of prefixSum = prefixSum[n] - prefixSum[i + 1].
            if (prefixSum[i] == prefixSum[n] - prefixSum[i + 1])
            return i;
        }
        System.out.println("\n"+"Complexity Analysis: ");
        System.out.print("Time: O(2n)" + "\n" + "Space: O(1)");
        return -1;
    }
}
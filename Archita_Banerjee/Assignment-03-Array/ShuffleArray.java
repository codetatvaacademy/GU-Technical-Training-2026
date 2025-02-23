
import java.util.Scanner;
public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        for(int i =0;i<n;i++){
            result[2*i]= nums[i];
            result[2*i+1]= nums[i+n];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int[] nums = new int[2 * n];
        System.out.println("Enter the elements of the array (total " + (2 * n) + " elements):");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = scanner.nextInt();
        }
        int[] result = shuffle(nums, n);
        System.out.println("The shuffled array is:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

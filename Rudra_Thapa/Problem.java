import java.util.Scanner;

public class Problem {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] newNums = new int[n * 2];

        for (int i = 0; i < n; i++) {
            newNums[i] = nums[i];      
            newNums[i + n] = nums[i];  
        }

        return newNums;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Size of the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] result = getConcatenation(nums);

        System.out.println("Concatenated Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

import java.util.Scanner;

public class permutationToArray {
    public static int[] buildArray(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = nums[nums[i]];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = new int[n];
        result = buildArray(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
        }

        sc.close();

    }

}

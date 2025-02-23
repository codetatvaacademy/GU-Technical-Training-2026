import java.util.Scanner;
import java.util.Arrays;

public class ConcatinationOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    private static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i=0; i<ans.length; i++){
            ans[i]=nums[i%nums.length];
        }
        return ans;
    }
}
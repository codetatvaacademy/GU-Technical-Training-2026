import java.util.Scanner;

public class MinOps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(minOperations(nums));
    }
    public static int minOperations(int[] nums) {
        int totalOps = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]<=nums[i-1]){
                int ops = nums[i-1]-nums[i]+1;
                nums[i] += ops;
                totalOps+=ops;
            }
        }
        return totalOps;
    }
}
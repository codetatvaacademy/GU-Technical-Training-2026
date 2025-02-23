import java.util.*;
public class MinimumSwaps {
    public int minSwaps(int[] nums) {

        int totalOnes = 0;
        for(int num : nums){
            totalOnes += num;
        }

        int start = 0;
        int end = 0;
        int ones = nums[0];
        int minSwaps = totalOnes;
        
        while(start < nums.length){
            if(start != 0){
                ones -= nums[start-1];
            }

            while(end - start + 1 < totalOnes){
                ++end;
                ones += nums[end % nums.length];
            }
            minSwaps = Math.min(minSwaps, totalOnes - ones);
            ++start;
        }
        return minSwaps;
    }
    public static void main(String[] args) {
        MinimumSwaps obj = new MinimumSwaps();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.print("Enter the array (nums): ");
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int ans = obj.minSwaps(nums);
        System.out.print(ans);

    }
}

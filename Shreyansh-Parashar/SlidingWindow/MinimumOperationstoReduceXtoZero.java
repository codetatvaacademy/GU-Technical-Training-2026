import java.util.*;
public class MinimumOperationstoReduceXtoZero {
    public int minOperations(int[] nums, int x) {
        x = -x;

        for(int i = 0; i < nums.length; i++){
            x += nums[i];
        }

        if(x < 0)
            return -1;
        else if(x == 0)
            return nums.length;

        int start = 0;
        int end = 0;
        int count = 0;

        while(end < nums.length){
            x -= nums[end];
            
            while(x < 0){
                x += nums[start++];
            }
            if(x == 0){
                count = Math.max(count, (end - start)+1);
            }
                end++;
        }
        return count == 0 ? -1 : nums.length - count;
    }
    public static void main(String[] args) {
        MinimumOperationstoReduceXtoZero obj = new MinimumOperationstoReduceXtoZero();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of nums: ");
        int n = sc.nextInt();

        System.out.println("Enter nums 'Arrays of nums': " );
        int[] nums = new int[n];

        for(int i  = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter 'X' : ");
        int x  = sc.nextInt();

        int count = obj.minOperations(nums, x);
        System.out.println(count);
    }
}

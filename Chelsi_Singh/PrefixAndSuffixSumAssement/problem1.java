
import java.util.Scanner;

public class problem1 {
        public int weights(int[] nums) {
    
            int total = 0;
            int leftsum = 0;
            
            for (int ele : nums)
                total += ele;
            
            for (int i = 0; i < nums.length; leftsum += nums[i++])
                if (leftsum * 2 == total - nums[i])
                    return i; 
            return -1;
        }

        public static void main(String[] args) {
            problem1 p = new problem1();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
            }
            System.out.println(p.weights(nums));
        }
    }
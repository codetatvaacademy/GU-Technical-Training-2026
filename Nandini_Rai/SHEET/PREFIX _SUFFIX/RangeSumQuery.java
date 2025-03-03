import java.util.Scanner;
public class RangeSumQuery {
        int preSum[];
    
        public  void numArray(int[] nums) {
            preSum = new int[nums.length];
            preSum[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                preSum[i] = preSum[i - 1] + nums[i];
            }
        }
    
        public int sumRange(int left, int right) {
            if (left == 0)
                return preSum[right];
    
            return preSum[right] - preSum[left - 1];
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int nums[] = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            RangeSumQuery rs = new RangeSumQuery();
            int left = sc.nextInt();
            int right = sc.nextInt();
            System.out.println("Sum of range: " + rs.sumRange(left, right));
        }
    }

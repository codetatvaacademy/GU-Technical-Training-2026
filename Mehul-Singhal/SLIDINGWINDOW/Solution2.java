import java.util.*;
public class Solution2 {
        public int[] maxSlidingWindow(int[] nums, int k) {
            
           int length = nums.length;
            int[] leftMax = new int[length];
            int[] rightMax = new int[length];
            int[] answer = new int[length - k + 1];
    
            for (int start = 0; start < nums.length; start += k) {
                int end = start + k <= nums.length ? start + k - 1 : length - 1;
    
                for (int i = start, max = Integer.MIN_VALUE; i <= end; i++) {
                    max = Math.max(max, nums[i]);
                    leftMax[i] = max;
                } 
    
                for (int i = end, max = Integer.MIN_VALUE; i >= start; i--) {
                    max = Math.max(max, nums[i]);
                    rightMax[i] = max;
                }
            }
    
            for (int start = 0, end = k - 1; start < answer.length; start++, end++) {
                answer[start] = Math.max(leftMax[end], rightMax[start]);
            }
    
            return answer;
        }
    
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n = scanner.nextInt();
    int[] nums = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
        nums[i] = scanner.nextInt();
    }
    System.out.println("Enter the window size:");
    int k = scanner.nextInt();

    Solution2 solution = new Solution2();

    int[] result = solution.maxSlidingWindow(nums, k);

    System.out.println("The maximum values:");
    for (int value : result) {
        System.out.print(value + " ");
    }

    scanner.close();
}
}


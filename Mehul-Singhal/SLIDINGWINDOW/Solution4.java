import java.util.Scanner;

public class Solution4 {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
                  int start = 0;
                  int end = 0;
                  int count = 0;
                  int product = 1;
                  int m = nums.length;
                  while(end<m){
                    product *= nums[end];
                //  while(end<m){
                   // product *= nums[end];
                   while(product>=k && start<=end){
                    product /= nums[start];
                    start++;
                    
                   }
                  //  if(product<k){
                    //    count++;
                  //  }
                   // else{
                  //      product /= nums[start];
                  //  }
                   count+= end-start+1;
                   end++;
                    
                    
                  }
                  return count;
        }
        public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Enter the value of k:");
        int k = scanner.nextInt();
        Solution4 solution = new Solution4();
        int result = solution.numSubarrayProductLessThanK(nums, k);
        System.out.println("The number of subarrays : " + result);
        scanner.close();
        }
    
}


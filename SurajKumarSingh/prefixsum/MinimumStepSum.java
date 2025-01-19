// LeetCode --> 1413

package prefixsum;

import java.util.Scanner;

public class MinimumStepSum {
    public int minStartValue(int[] nums) {
        int min = 1;
        int sum = 0;
        for(int i = 0 ; i < nums.length; i++){
            sum += nums[i];
  
            if(sum < 1){
              min = Math.max( min , 1 - sum);
            }
        }
       return min;  
    }
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
      System.out.println("Enter the number of elements in the array:");
      int n = scanner.nextInt();
    
      int[] nums = new int[n];
      System.out.println("Enter the elements of the array:");
      for (int i = 0; i < n; i++) {
        nums[i] = scanner.nextInt();
       }
    
       MinimumStepSum mss = new MinimumStepSum();
       int result = mss.minStartValue(nums);
    
       System.out.println("The minimum starting value is: " + result);
    
       scanner.close();
    }   
}

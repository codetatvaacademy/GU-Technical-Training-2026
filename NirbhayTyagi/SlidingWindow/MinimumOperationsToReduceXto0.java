import java.util.Scanner;

public class MinimumOperationsToReduceXto0{
    public static  int minOperations(int[] nums, int x) {
            int rx = 0; 
            for(int num : nums){
             rx += num; 
            } 
            x = rx - x;
            if(x < 0){
             return -1;
            }
            if(x == 0){
             return nums.length;
            }
            int start = 0;
            int end = 0;
            int maxLength = 0;
            while(end < nums.length){
             x -= nums[end];
             while(x < 0){
                 x += nums[start];
                 start++;
             }
             if(x==0){
                 maxLength = Math.max(maxLength, end-start+1);
             }   
             end++;
            }
            return maxLength == 0 ? -1 : nums.length - maxLength;
         }
    
         public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the no of elements in array:");
             int n = sc.nextInt();
             int[] nums = new int[n];
             System.out.println("Enter the elements of array:");
             for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt(); 
             }
             System.out.println("Enter the value of k:");
             int x = sc.nextInt();
             System.out.println("The answer will be:" + minOperations(nums, x));
     }
}
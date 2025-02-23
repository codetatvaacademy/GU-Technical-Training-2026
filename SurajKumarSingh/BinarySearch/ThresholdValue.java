//Leetcode - 1283

package BinarySearch;
import java.util.Scanner;

public class ThresholdValue {

    private int countsum(int [] nums, int divisor){
        int sum = 0;
        for(int i = 0; i< nums.length; i++){
           sum += (nums[i] + divisor - 1)/ divisor;
        }
       return sum;
   }

   public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 0;
        for(int i = 0; i< nums.length; i++){
           right = Math.max(right,nums[i]);
        }
        while(left <= right){
           int mid = (left + right)/2;
           if(countsum(nums,mid)<= threshold){
               right = mid - 1;
           }
           else{
               left = mid + 1;
           }
       }
       return left;
   }
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        
    
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        
        
        int[] nums = new int[n];
        
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
    
        System.out.println("Enter the threshold value: ");
        int threshold = sc.nextInt();
        
    
        ThresholdValue thresholdValue = new ThresholdValue();
        
    
        int result = thresholdValue.smallestDivisor(nums, threshold);
        
        System.out.println("The smallest divisor is: " + result);
        
        sc.close();
   }
} 


// Leetcode - 1760

package BinarySearch;

import java.util.Scanner;

public class BallInBag {
    public boolean ispossible(int [] nums, int ans, int operation){
        for(int i = 0; i < nums.length; i++){
            operation -= (nums[i] -1) / ans;
            if(operation < 0){
                return false;
            }
        }
        return true;
    }


    public int minimumSize(int[] nums, int maxOperations) {
       int left = 1, right = 0, mid;

       for(int i = 0; i<nums.length; i++){
        right = Math.max(right,nums[i]);
       } 

       while(left < right){
        mid = (left + right)/2;

        if(ispossible(nums,mid,maxOperations)){
            right = mid ; 
        }else{
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
        
        System.out.println("Enter the maximum number of operations: ");
        int maxOperations = sc.nextInt();
        
        
        BallInBag ballInBag = new BallInBag();
        
    
        int result = ballInBag.minimumSize(nums, maxOperations);
        
        
        System.out.println("The minimum size is: " + result);
        
    
        sc.close();
    }
}

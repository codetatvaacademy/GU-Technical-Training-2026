package LovelyKumari.PrefixAndSuffixSum;
import java.util.*;
public class Problem01 {
    public static int leftMostMiddleIndex(int nums[]){ //Time Complexity: O(n) and Space Complexity: O(1)
        int n= nums.length;
        int sum=0; int leftSum=0;
        
        for(int num:nums){
            sum=sum+num;
        }

        for(int i=0 ; i<n ; i++){
            int rightSum=sum-leftSum-nums[i];
            if (leftSum == rightSum) {
                return i; // balances perfectly -> balance point
            }
            leftSum=leftSum+nums[i];  
        }
        return -1 ; // if no balance point is found -> balance condition is not satisfied

    }
    public static void main(String[] args) {
        int[] nums = {2,5} ; // {1,-1,4} ; // {2, 3, -1, 8, 4};
        int result = leftMostMiddleIndex(nums);
        System.out.println("Output: " + leftMostMiddleIndex(nums));
    }
    
}

     
       


       
//Leetcode --> 724

package prefixsum;

import java.util.Scanner;

public class PivotIndex {
    public int pivotindex(int[] nums) {
        int n  = nums.length;
        int tsum = 0;
        for(int i = 0; i<n; i++){
           tsum += nums[i];
        }
        int leftsum = 0;
        int rightsum = 0;
        for(int i = 0; i<nums.length; i++){
           rightsum = tsum - leftsum - nums[i];
           if(leftsum == rightsum){
               return i;
            }
           else{
               leftsum += nums[i];
            }
        } 
    return -1; 
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

    
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        
        PivotIndex pivotIndex = new PivotIndex();

        
        int result = pivotIndex.pivotindex(nums);

    
        if (result != -1) {
            System.out.println("The pivot index is: " + result);
        } else {
            System.out.println("There is no pivot index.");
        }

        scanner.close();
    }
}

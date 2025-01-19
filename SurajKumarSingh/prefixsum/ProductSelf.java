//LeetCode --> 238

package prefixsum;

import java.util.Scanner;

public class ProductSelf {
    public int[] productExceptSelf(int[] nums) {
        int nums1[] = new int[nums.length];
        int nums2[] = new int[nums.length];
        nums1[0] = 1;
        nums2[nums2.length - 1] = 1;
           for(int i = 1; i<nums.length; i++){
               nums1[i] = nums1[i - 1]*nums[i - 1];
            }  
           for(int i = nums.length - 2; i> -1; i--){
                nums2[i] = nums2[i + 1]*nums[i + 1];
            }  
        int[] ans = new int[nums.length];
           for(int i = 0; i< nums.length; i++){
              ans[i] = nums1[i] * nums2[i];
            }
        return ans;
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

        
        ProductSelf productSelf = new ProductSelf();

    
        int[] result = productSelf.productExceptSelf(nums);

        
        System.out.println("The product of array elements except self is:");
        for (int value : result) {
            System.out.print(value + " ");
        }
        System.out.println();

        scanner.close();
    }
}

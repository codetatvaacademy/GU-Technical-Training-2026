package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayFromPermutation {
    public static int[] buildArray(int[] nums) {
        int n=nums.length; /* Brute - Force Approach 
        int [] ans = new int[n];

        for(int i=0; i<n ; i++){
            ans[i]=nums[nums[i]];
        }
        return ans; */

        // Optimized 
        
        for(int i=0; i<n; i++){
            nums[i]= n*(nums[nums[i]]% n) + nums[i] ;
        }
        for(int i=0; i<n ; i++){
            nums[i]=nums[i]/n ;
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elemnts: ");
        int n=sc.nextInt();
        int[] nums= new int[n];

        System.out.println("Enter the elements (different values from 0 to " + (n-1)+ "):");
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }

        int[] answer=buildArray(nums);
        System.out.println("Output " + Arrays.toString(answer));
    }
}

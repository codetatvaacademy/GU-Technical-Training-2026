package Arrays;
import java.util.Scanner;

public class MinOprtnToMakeArrayIncre { // 1827
    public static int minOperations(int[] nums) {
        int totalOperations=0;
        int n=nums.length;
        for(int i=1; i<n; i++){
            if(nums[i] <= nums[i-1]){
                totalOperations += (nums[i-1] - nums[i]) + 1;
                nums[i] = nums[i-1] + 1;
            }
        }
        return totalOperations;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements(n): ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int ans=minOperations(nums);
        System.out.print("Output: "+ans);
    }
    
}

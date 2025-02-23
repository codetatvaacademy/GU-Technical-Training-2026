import java.util.Scanner;

public class ArrayFromPerm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
        
        
        nums = buildArray(nums);

        for(int i:nums){
            System.out.print(i + " ");
        }
    }
    public static int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
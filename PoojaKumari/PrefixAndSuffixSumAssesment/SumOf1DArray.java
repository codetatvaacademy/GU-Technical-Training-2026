import java.util.Scanner;

public class SumOf1DArray {
    public static int[] runningSum(int[] nums) {
        
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of Array:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter the element of array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int[] result=new int[n];
        result=runningSum(nums);
        for(int i=0;i<n;i++){
            System.out.print(" "+result[i]);
        }
        sc.close();
    }
}

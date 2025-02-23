import java.util.Scanner;
public class MinOperationforArrayIncreasing {
    public static int minOperations(int[] nums) {
        int operations=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=nums[i];
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<=arr[i]){
               arr[i+1]=arr[i]+1;
            }
        }
        for(int i=0;i<nums.length;i++){
            operations+=arr[i]-nums[i];
        }
        return operations;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of Array:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter the elements of Array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int result=minOperations(nums);
        System.out.print(result);
        sc.close();

    }
    
}

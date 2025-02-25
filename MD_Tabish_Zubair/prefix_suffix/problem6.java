import java.util.Scanner;

public class problem6 {
    public static int pivotIndex(int[] nums) {
        int sum=0;
        int pre=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(pre - (sum-pre-nums[i]) == 0)
            return i;

            else
            pre+=nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans=pivotIndex(arr);
        
            System.out.println(ans);
    }
}

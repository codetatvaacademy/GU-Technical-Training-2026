import java.util.Scanner;

public class problem9 {
    public static int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int pre=1;
        int suff=1;
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=pre;
            pre*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            arr[i]*=suff;
            suff*=nums[i];
        }
        return arr;
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
        arr=productExceptSelf(arr);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

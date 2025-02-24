import java.util.Scanner;

public class problem19 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] L=new int[nums.length];
        int[] R=new int[nums.length];
        int n=nums.length;
        int[] ans=new int[n-k+1];
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        { 
            if(i % k==0)
            L[i]=nums[i];
            else
            L[i]=Math.max(L[i-1],nums[i]);
        }
        for(int i=nums.length-1 ; i>=0 ; i--)
        { 
            if(i==n-1 || (i+1) % k ==0)
            R[i]=nums[i];
            else
            R[i]=Math.max(R[i+1] , nums[i]);
        }

        for(int i=0;i<n-k+1;++i)
        {
            ans[i]=Math.max(L[i+k-1], R[i]);
        }
        return ans;

    }
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        System.out.println("Enter the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] ans=maxSlidingWindow(arr,k);
        System.out.println(ans);
    }
}

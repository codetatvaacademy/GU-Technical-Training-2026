import java.util.Scanner;

public class problem12 {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int sum=0;
        int pro=1;
        if(k<=1)
        return 0;
        int s=0,e=0;
        while(e<nums.length)
        {
            pro*=nums[e];
            while(pro>=k)
            {
                pro/=nums[s];
                s++;
            }
            sum+=e-s+1;
            e++;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the k");
        int k=sc.nextInt();
        int ans=numSubarrayProductLessThanK(arr,k);
        System.out.println(ans);
    }
}

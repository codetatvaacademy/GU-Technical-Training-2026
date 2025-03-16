import java.util.Scanner;

public class problem17 {
    public static int minOperations(int[] nums, int x) {
        
        int n=nums.length;
        int k=-x;
        int min=n;
        for(int a: nums)
        {
            k+=a;
        }
        if(k==0)
        return n;
        int s=0;
        int e=0;
        boolean vld=false;
        while(e<n)
        {
            k-=nums[e];
            while(k<=0 && s<=e)
            {
                if(k==0)
                {
                    vld=true;
                    min=Math.min(min,(n-(e-s+1)) );
                }
                k+=nums[s];
                s++;
            }
            e++;
        }
        if(vld==false)
        return -1;
       return min;
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
        int ans=minOperations(arr,k);
        System.out.println(ans);
    }
}

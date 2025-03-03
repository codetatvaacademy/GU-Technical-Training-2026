import java.util.Scanner;

public class problem14 {
    public static int minSubArrayLen(int target, int[] nums) {
        int s=0;
        int e=0;
        int sum=0;
        int minlen=nums.length;
        boolean val=false;
        while(e<nums.length)
        {
            sum+=nums[e];
            while(sum>=target && s<nums.length)
            {
                minlen=Math.min(minlen,e-s+1);
                sum-=nums[s];
                s++;
                
                val=true;
            }
           
            e++;
        }
        if(val==true)
            return minlen;
        return 0;
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
        System.out.println("Enter the target");
        int t=sc.nextInt();
        int ans=minSubArrayLen(t,arr);
        System.out.println(ans);
    }
}

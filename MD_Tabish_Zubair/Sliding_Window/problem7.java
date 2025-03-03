import java.util.Scanner;

public class problem7 {
    public static int longestOnes(int[] nums, int k) {
        int s = 0;
        int e = 0;
        int ans = Integer.MIN_VALUE;
        while (e < nums.length) {
            if (nums[e] == 0)
                k--;
            while (k < 0) {
                if (nums[s] == 0)
                    k++;
                s++;
            }
            ans = Math.max(ans, (e - s + 1));
            e++;
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
        int ans=longestOnes(arr,k);
        System.out.println(ans);
    }
    
}

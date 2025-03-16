import java.util.Scanner;

public class problem2 {
    public static int numberOfSubarrays(int[] nums, int k) {
        int s = 0;
        int e = 0;
        int k1 = k;
        int sum1 = 0;
        while (e < nums.length) {
            if (nums[e] % 2 == 1)
                k1--;
            while (k1 < 0) {
                if (nums[s] % 2 == 1)
                    k1++;
                s++;
            }
            sum1 += e - s + 1;
            e++;

        }
        s = 0;
        e = 0;
        k1 = k - 1;
        int sum2 = 0;
        while (e < nums.length) {
            if (nums[e] % 2 == 1)
                k1--;
            while (k1 < 0) {
                if (nums[s] % 2 == 1)
                    k1++;
                s++;
            }
            sum2 += e - s + 1;
            e++;

        }
        return sum1 - sum2;

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
        int ans=numberOfSubarrays(arr,k);
        System.out.println(ans);
    }
    
}

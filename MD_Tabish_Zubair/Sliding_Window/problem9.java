import java.util.Scanner;

public class problem9 {
    public static int maximumUniqueSubarray(int[] nums) {
        int[] freq = new int[100001];
        int s = 0;
        int e = 0;
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        while (e < nums.length) {

            sum += nums[e];
            freq[nums[e]]++;
            while (freq[nums[e]] > 1 && s < e) {
                sum -= nums[s];
                freq[nums[s]]--;
                s++;
            }
            maxsum = Math.max(maxsum, sum);
            e++;
        }
        return maxsum;
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
        int ans=maximumUniqueSubarray(arr);
        System.out.println(ans);
    }
}

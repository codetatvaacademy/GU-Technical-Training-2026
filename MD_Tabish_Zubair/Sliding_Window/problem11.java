import java.util.Scanner;

public class problem11 {
    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int tot = 0;
        k = n - k;
        for (int i = 0; i < n; i++) {
            tot += cardPoints[i];
        }
        if (k == n)
            return tot;
        int s = 0;
        int e = 0;
        int maxsum = 0;
        while (e < n) {
            tot -= cardPoints[e];
            if ((e - s + 1) > k) {
                tot += cardPoints[s];
                s++;
            }
            if ((e - s + 1) == k)
                maxsum = Math.max(maxsum, tot);
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
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        System.out.println("Enter the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans=maxScore(arr,k);
        System.out.println(ans);
    }
}

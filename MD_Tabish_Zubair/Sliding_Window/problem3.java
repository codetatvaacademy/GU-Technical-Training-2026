import java.util.Scanner;

public class problem3 {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int s=0;
        int sum=0;
        int e=k;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        int c=0;
        if(sum/k >= threshold)
        c++;
        while(e<arr.length)
        {
            sum=sum + arr[e] - arr[s];
            if(sum/k >= threshold)
            c++;
            s++;
            e++;
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        System.out.println("Enter the value of th");
        int th=sc.nextInt();
        System.out.println("Enter the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans=numOfSubarrays(arr,k,th);
        System.out.println(ans);
    }
}

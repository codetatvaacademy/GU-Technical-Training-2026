import java.util.Scanner;

public class problem2 {
    public static int largestAltitude(int[] gain) {
        int[] arr= new int[gain.length];
        arr[0]=gain[0];
        for(int i=1;i<gain.length;i++)
        {
            arr[i]=arr[i-1]+gain[i];
        }
        int sum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>sum)
            sum=arr[i];
        }
        if(sum<0)
        return 0;
        else
        {return sum;}
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
        int ans=largestAltitude(arr);
        
            System.out.println(ans);
    }
}

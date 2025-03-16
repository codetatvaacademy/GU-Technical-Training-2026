import java.util.Scanner;

public class problem16 {
    public static int numberOfAlternatingGroups(int[] colors, int k) {
        int n=colors.length;
        int s=0;
        int e=1;
        
        int count=0;
        while(e < (2*n))
        {
            if( colors[e%n] == colors[(e-1)%n] )
            {
                s=e;
            }
            else
                
                if( (e - s + 1) >= k && (e - s + 1) % k == 0)
                {
                    count++;
                    s++;
                }
            if(e==n-1)
            count=0;
            
                e++;
        }
        return count;
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
        int ans=numberOfAlternatingGroups(arr,k);
        System.out.println(ans);
    }
}

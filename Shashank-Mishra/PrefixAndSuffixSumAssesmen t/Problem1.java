import java.util.*;
public class problemOne {
    
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int n=sc.nextInt();
      int nums []= new int[n];
      for(int i=0;i<n;i++)
      {
        nums[i]=sc.nextInt();
      }
      int s;
        for(int i=1;i<n;i++)
        {
            nums[i] += nums[i-1];
        }
        int mid =(n+1)/2;
            if(nums[mid-1]==nums[mid+1]-nums[mid])
            {
                 s= nums[mid-1];
                System.out.println(s);;
            }
            else
            {
                System.out.println(-1);
            }
            if(mid==0||mid==n-1)
            {
                s=0;
                System.out.println(s);
            }

        
    }
}

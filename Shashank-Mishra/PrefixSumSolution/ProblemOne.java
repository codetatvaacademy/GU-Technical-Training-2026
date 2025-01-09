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
      int x=check(nums);
      System.out.println(x);
    }
    public static int check(int nums[])
    {
      int n=nums.length;
      for(int i=1;i<n;i++)
      {
        nums[i] +=nums[i-1];
      }
       for(int i=0;i<n;i++)
       {
        if(i==0)
        {
            if(nums[n-1]-nums[i]==0)
            {
                return i;
            }
        }
        else if(nums[i-1]==nums[n-1]-nums[i])
        {
          return i;
        }
        if(i==n-1)
        {
         if(nums[i-1]==0)
         {
            return i;
         }
        }
       }
       return-1;
    }
        
}

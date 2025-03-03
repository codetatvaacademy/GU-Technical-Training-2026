import java.util.Scanner;

public class problem6 {
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int max=0;
        int sum=0;
        int s=0;
        int e=0;
        int n=customers.length;
        
        while(e < n)  
        {
           if(e-s>=minutes)
           {
               if(grumpy[s]==1)
               sum-=customers[s];
               s++;
           }
           if(grumpy[e]==1)
           sum+=customers[e];
           max=Math.max(max,sum);
           
           e++;
        } 
        for(int i=0;i<n;i++)
        {
           if(grumpy[i]==0)
           max+=customers[i];
        }
   
        return max;
        
       }
       public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the length of grumpy");
        int m=sc.nextInt();
        int grumpy[]=new int[m];
        System.out.println("Enter the array");
        for(int i=0;i<m;i++)
        {
            grumpy[i]=sc.nextInt();
        }
        System.out.println("Enter the minutes");
        int min=sc.nextInt();
        int ans=maxSatisfied(arr,grumpy,min);
        System.out.println(ans);
    }
}

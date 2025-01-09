import java.util.Scanner;
class Program{
    public static int findDiff(int arr[])
    {
        int s=0;
        int e= arr.length;
        int mid=s+(e-s)/2;
        int sum=0, sum1=0;
        for(int i=0;i<=mid;i++)
        {
           sum+=arr[i];
        }
        for(int j=mid+1;j<e;j++)
        {
            sum1+=arr[j];
        }
        return Math.abs(sum1-sum);

    }
    public static int checkElement(int arr[],int target)
    {
        
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]==target)
        {
            return i;
        }
        
      }
      return -1;
    }
public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the size of an array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter the elements of an array");
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }
    int x= findDiff(arr);
   int ans=checkElement(arr,x);
   if(ans!=-1)
   System.out.print("The Seasaw Will Be Perfectly Balanced At Index :"+" "+ans);
   else
   System.out.print(ans+" "+" That Means No index satisfies the balance condition");


//    time complexity O(n);
//  space complexity O(1); 
}
}
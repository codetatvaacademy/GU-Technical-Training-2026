import java.util.Scanner;

public class problem8 {
    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int pre=0 , total=0 , n=nums.length-1;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            total+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {

        }
     return arr;   
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
        arr=getSumAbsoluteDifferences(arr);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

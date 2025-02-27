import java.util.Scanner;

public class problem4 {
    int[] arr;

    public  problem4(int[] nums) {
        this.arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
           arr[i]=nums[i];
        }
        
    }

    
    public int sumRange(int left, int right) {
        int sum=0;
        for(int i=left;i<=right;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the left");
        int l=sc.nextInt();
        System.out.println("Enter the right");
        int r=sc.nextInt();
        problem4 numArray = new problem4(arr);
        System.out.println("Sum from index "+l+ " to "+r+":" + numArray.sumRange(l, r));
        
    }
}

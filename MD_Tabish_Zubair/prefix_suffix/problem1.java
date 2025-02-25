import java.util.Scanner;

class problem1
{
    public static int[] runningSum(int[] nums) {
        int pre=0;
        for(int i=0;i<nums.length;i++)
        {
            pre+=nums[i];
            nums[i]=pre;
        }
        return nums;
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
        arr=runningSum(arr);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
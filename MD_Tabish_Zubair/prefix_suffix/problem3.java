import java.util.Scanner;

public class problem3 {
    public static int minStartValue(int[] nums) {
        int min_sum=0;
        int pre=0;
        for(int i=0;i<nums.length;i++)
        {
            pre+=nums[i];
            if(pre<min_sum)
            min_sum=pre;
        }
        return Math.abs(min_sum)+1;
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
        int ans=minStartValue(arr);
        
            System.out.println(ans);
    }
}

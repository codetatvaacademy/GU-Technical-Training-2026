import java.util.Scanner;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int i=0;i<n;i++){
        int leftSum=0;
        int rightSum=0;
            if(i==0){
                leftSum=0;
            }else{
                leftSum=prefix[i-1];
            }
            rightSum=prefix[n-1]-prefix[i];
            if(leftSum==rightSum){
                return i;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter the elements of Array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int result=pivotIndex(nums);
        System.out.print(result);
        sc.close();
    }
}

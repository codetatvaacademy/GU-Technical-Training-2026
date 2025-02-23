import java.util.*;
public class ThirdQuestion {
    public static int largestSumOfMinimizedSubArray(int[] nums,int k){
        Arrays.sort(nums);
        int start=0;
        int end=0;
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int maxSum=max+nums[end];
        while(end<nums.length){
            sum+=nums[end];
            if(sum>maxSum){
                nums[start]=nums[end];
                sum=nums[end];
                k--;
            }
            else{
                end++;
            }
        }
        return sum ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array nums and also enter the number of splits:");
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter the Elements of nums:");
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        int result=0;
        result=largestSumOfMinimizedSubArray(nums, k);
        System.out.println(result);
        sc.close();
    }
    
}

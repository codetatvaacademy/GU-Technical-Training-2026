import java.util.Scanner;
class RunningSum {
    public int[] runningSum(int[] nums) {
        int ans[] =new int[nums.length];
        ans[0]= nums[0];
        for(int i=1;i<nums.length;i++){
             ans[i] = ans[i-1]+nums[i];
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        RunningSum rs = new RunningSum();
        int result[] = rs.runningSum(nums);
        for(int i=0;i<nums.length;i++){
           System.out.print(result[i]+" ");
        }
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class MinimizeMaximumDiff {
    public boolean isValid(int nums[],int p,int mid){
         int pairs=0;
         int i=0;
         while(i<nums.length-1){
            if(nums[i+1]-nums[i]<=mid){
                i++;
                pairs++;
            }
                i++;
         }
         return pairs>=p;
    }
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int min =0;
        int max = nums[nums.length-1]-nums[0];
        while(min<max){
            int mid = (min+max)/2;
            if(isValid(nums,p,mid)){
                max = mid;
            }else{
                min= mid+1;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int p = sc.nextInt();

    
       MinimizeMaximumDiff md = new MinimizeMaximumDiff();
        int result = md.minimizeMax(nums, p);

    
        System.out.println(result);
    }
}

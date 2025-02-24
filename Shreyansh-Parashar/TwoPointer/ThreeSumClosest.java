import java.util.*;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
       int closest = 0;
       int diff = 0;
       int max = Integer.MAX_VALUE;
       for(int i = 0; i< nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;

            while(j < k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == target){
                    return target;
                }else if(sum < target){
                    j++;
                }else{
                    k--;
                }
                diff = Math.abs(sum-target);
                if(diff < max){
                    max= diff;
                    closest = sum;
                }
            }
       }
       return closest; 
    }
    public static void main(String[] args) {
        ThreeSumClosest obj = new ThreeSumClosest();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int closest = obj.threeSumClosest(nums, target);
        System.out.println(closest);
        sc.close();
    }
}

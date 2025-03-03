import java.util.*;

public class MinimumIncrementtoMakeArrayUnique {
    public int minIncrementForUnique(int[] nums) {
        int maxInt = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            maxInt = Math.max(nums[i],maxInt);
        }
        //ek naya array banayege maxInt + nums.length
        int sizeOfNewNums = maxInt + nums.length;
        int[] newNums = new int[sizeOfNewNums];

        for(int i = 0; i < nums.length; i++){
            newNums[nums[i]]++;
        }

        int i = 0;
        int ans = 0;
        while(i < newNums.length){
            if(newNums[i]>1){
                int extra = newNums[i] - 1;
                newNums[i+1] += extra;
                ans += extra;
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        MinimumIncrementtoMakeArrayUnique obj = new MinimumIncrementtoMakeArrayUnique();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int ans = obj.minIncrementForUnique(nums);
        System.out.println(ans);
        sc.close();
    }
}

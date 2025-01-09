//Time Complexity: O(n) & Space Complexity: O(n)
import java.util.*;
public class Problem1 {
    public static int balance(int[] nums, int n){
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = nums[0];
        suffix[n-1] = nums[n-1];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        for(int i=n-2;i>=0;i--){
            suffix[i] = suffix[i+1] + nums[i];
        }
        for(int i=0;i<n;i++){
            if(prefix[i] == suffix[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        
        System.out.println(balance(nums,n));
        sc.close();
    }
}

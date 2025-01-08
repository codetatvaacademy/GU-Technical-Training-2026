//Time Complexity: O(n) & Space Complexity: O(n)
import java.util.*;
public class Problem1 {
    public static int balance(int[] nums, int n){
        if(n==1){
            return nums[0] == 0 ? 0:-1;
        }

        int[] prefixL = new int[n];
        prefixL[1] = nums[0];

        for(int i =1 ;i<n;i++){
            prefixL[i] += prefixL[i-1]+nums[i];
        }

        int total = prefixL[n-1];
        if(n>2){
            prefixL[n-1] = 0;
        }

        for(int i=1;i<n-1;i++){
            if(prefixL[i] == total-prefixL[i-1]){
                return i;
            }
        }

        return prefixL[n-1] == prefixL[n-2] ? n-1 :-1 ;
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

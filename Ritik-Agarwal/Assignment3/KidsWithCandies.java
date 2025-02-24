import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidsWithCandies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int extraCandies = sc.nextInt();
        sc.close();

        List<Boolean> ans = new ArrayList<>();
        ans = kidsWithCandies(nums, extraCandies);
        System.out.println(ans);
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int candy:candies){
            max = (max<candy)?candy:max;
        }
        List<Boolean> ans = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            ans.add((candies[i]+extraCandies)>=max?true:false);
        }
        return ans;
    }
}
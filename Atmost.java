import java.util.*;

public class Atmost {
    public int atMost(int[] nums, int k) {
        int start = 0, end = 0, ans = 0;
        while (end < nums.length) {
            k -= nums[end] % 2;
            while (k < 0) {
                k += nums[start] % 2;
                start++;
            }
            ans += end - start + 1;
            end++;
        }
        return ans;
    }

    public int numberOfSubarrays(int[] nums, int k) { 
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        Atmost sol = new Atmost();
        System.out.println(sol.numberOfSubarrays(nums, k));
        sc.close();
    }
}

import java.util.*;

public class EqualSubstringWithCost {
    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0, sum = 0, ans = 0;
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        for (int right = 0; right < s.length(); right++) {
            sum += Math.abs(s1[right] - t1[right]);
            while (sum > maxCost) {
                sum -= Math.abs(s1[left] - t1[left]);
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int maxCost = sc.nextInt();

        EqualSubstringWithCost sol = new EqualSubstringWithCost();
        System.out.println(sol.equalSubstring(s, t, maxCost));

        sc.close();
    }
}

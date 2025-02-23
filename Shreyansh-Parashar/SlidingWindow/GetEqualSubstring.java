import java.util.*;
public class GetEqualSubstring {
    public int equalSubstring(String s, String t, int maxCost) {
        int start = 0;
        int end = 0;
        int cost = 0;
        int maxLength = 0;
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        while (end < s1.length){
            cost += Math.abs(s1[end] - t1[end]);

            while(cost > maxCost){
                cost -= Math.abs(s1[start] - t1[start]);
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }
        return maxLength;
    }
    public static void main(String[] args) {
        GetEqualSubstring obj = new GetEqualSubstring();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter String t: ");
        String t = sc.nextLine();

        System.out.print("Enter maxCost: ");
        int maxCost = sc.nextInt();

        int maxLength = obj.equalSubstring(s, t, maxCost);
        System.out.print(maxLength);
    }
}

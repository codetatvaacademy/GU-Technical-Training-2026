import java.util.*;

public class AlternatingColorGroups {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int start = 0, end = 1, n = colors.length, count = 0;

        while (end < n + k - 1) {
            if (colors[(end - 1) % n] == colors[end % n]) {
                start = end;
            }
            if (end - start + 1 == k) {
                start++;
                count++;
            }
            end++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] colors = new int[n];

        for (int i = 0; i < n; i++) {
            colors[i] = sc.nextInt();
        }

        AlternatingColorGroups sol = new AlternatingColorGroups();
        System.out.println(sol.numberOfAlternatingGroups(colors, k));

        sc.close();
    }
}

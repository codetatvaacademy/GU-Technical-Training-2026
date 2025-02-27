import java.util.*;

public class NumberofAlternating {
    public int numberOfAlternatingGroups(int[] colors) {
        int ans = 0, n = colors.length;
        for (int i = 0; i < n; i++) {
            if (colors[(i + 1) % n] != colors[i] && colors[i] != colors[(i - 1 + n) % n]) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] colors = new int[n];

        for (int i = 0; i < n; i++)
            colors[i] = sc.nextInt();

        NumberofAlternating sol = new NumberofAlternating();
        System.out.println(sol.numberOfAlternatingGroups(colors));
        sc.close();
    }
}

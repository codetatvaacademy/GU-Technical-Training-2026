import java.util.Scanner;

public class Palternativegroup2 {
    public static int numberOfAlternatingGroups(int[] colors, int k) {
        int start = 0;
        int end = 1;
        int ans = 0;
        int ans2 = 0;
        while (end < 2 * colors.length) {
            if (colors[(end - 1) % colors.length] == colors[(end) % colors.length]) {
                start = end;
            } else if (end - start + 1 >= k) {
                ans++;
            }
            if (end == colors.length - 1) {
                ans2 = ans;
            }
            end++;
        }
        return ans - ans2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int[] colors = new int[size];
        for (int i = 0; i < size; i++) {
            colors[i] = sc.nextInt();
        }
        System.out.println(numberOfAlternatingGroups(colors, k));
    }
}

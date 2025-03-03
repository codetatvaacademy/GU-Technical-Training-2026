import java.util.*;

public class HighestAltitude {
    public static int largestAltitude(int[] gain) {
        int altitude = 0, maxAltitude = 0;
        for (int g : gain) {
            altitude += g;
            maxAltitude = Math.max(maxAltitude, altitude);
        }
        return maxAltitude;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] gain = new int[n];

        for (int i = 0; i < n; i++)
            gain[i] = sc.nextInt();

        System.out.println(largestAltitude(gain));
        sc.close();
    }
}

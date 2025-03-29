import java.util.Scanner;

public class XcompareVersionString {
    public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int m = v1.length;
        int n = v2.length;

        int i = 0;
        while (i < m || i < n) {
            int a = i < m ? Integer.parseInt(v1[i]) : 0;
            int b = i < n ? Integer.parseInt(v2[i]) : 0;

            if (a > b)
                return 1;
            else if (b > a)
                return -1;
            i++;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first version string: ");
        String version1 = sc.next();
        System.out.println("Enter the second version string: ");
        String version2 = sc.next();
        System.out.println(compareVersion(version1, version2));
        
    }
}

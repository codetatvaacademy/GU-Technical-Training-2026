import java.util.Scanner;

public class compareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        for (int i = 0, j = 0; i < version1.length() || j < version2.length(); i++, j++) {
            int val1 = 0;
            int val2 = 0;

            while (i < version1.length() && version1.charAt(i) != '.') {
                val1 = val1 * 10 + version1.charAt(i++) - '0';
            }

            while (j < version2.length() && version2.charAt(j) != '.') {
                val2 = val2 * 10 + version2.charAt(j++) - '0';
            }

            if (val1 < val2) {
                return -1;
            } else if (val1 > val2) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first version number: ");
        String version1 = scanner.next();

        System.out.print("Enter second version number: ");
        String version2 = scanner.next();

        scanner.close();

        compareVersionNumbers obj = new compareVersionNumbers();
        int result = obj.compareVersion(version1, version2);

        System.out.println("Comparison result: " + result);
    }
}

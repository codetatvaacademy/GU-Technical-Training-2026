import java.util.*;

class VersionControl {
    boolean isBadVersion(int version) {
        return version >= 4; 
    }
}

public class first_bad_version extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total number of versions: ");
        int n = scanner.nextInt();

        first_bad_version solution = new first_bad_version();
        System.out.println("First bad version is: " + solution.firstBadVersion(n));
        
        scanner.close();
    }
}

import java.util.*;

public class Problem01 {
    public static int countOccurrences(int[] arr, int target) {
        int firstIdx = findFirst(arr, target);
        if (firstIdx == -1) {
            return 0; // Target not found
        }
        int lastIdx = findLast(arr, target);
        return lastIdx - firstIdx + 1;
    }

    private static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                ans = mid;
                right = mid - 1; // Look on the left side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    private static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("arr[] = " + "[");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("]");

        System.out.print("target: ");
        int target = sc.nextInt();

        int count = countOccurrences(arr, target);
        System.out.println("The number of occurrences of " + target + " is: " + count);

    }
}

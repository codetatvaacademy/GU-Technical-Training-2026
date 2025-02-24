import java.util.*;
public class CountOccurrencesBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of arr");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target ");
        int target = sc.nextInt();
        int count = countOccurrences(arr, target);
        System.out.println("Output: " + count);
    }

    public static int countOccurrences(int[] arr, int target) {
        int first = findFirstOccurrence(arr, target);//TC-O(Log n)
        if (first == -1) {
            return 0;
        }
        int last = findLastOccurrence(arr, target);//TC-O(Log n)
        return last - first + 1;
    }

    private static int findFirstOccurrence(int[] arr, int target) { //TC-O(Log n)
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    private static int findLastOccurrence(int[] arr, int target) { //TC-O(Log n)
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}

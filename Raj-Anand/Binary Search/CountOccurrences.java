import java.util.Scanner;

public class CountOccurrences {

    public static int findFirstOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int si = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                si = mid;
                end = mid - 1; // Move left to find earlier occurrence
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return si;
    }

    public static int findLastOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int li = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                li = mid;
                start = mid + 1; // Move right to find later occurrence
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return li;
    }

    public static int countOccurrences(int[] arr, int target) {
        int first = findFirstOccurrence(arr, target);
        int last = findLastOccurrence(arr, target);

        if (first == -1) return 0;

        return last - first + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " sorted elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target value to search:");
        int target = sc.nextInt();

        int result = countOccurrences(arr, target);
        System.out.println("The target " + target + " occurs " + result + " times in the array.");
    }
}


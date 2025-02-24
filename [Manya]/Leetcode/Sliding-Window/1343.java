import java.util.Scanner;

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int count = 0;
        int target = k * threshold;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if (sum >= target) {
            count++;
        }

        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            if (sum >= target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        System.out.print("Enter the threshold: ");
        int threshold = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.numOfSubarrays(arr, k, threshold);
        System.out.println("Number of subarrays meeting the condition: " + result);

        scanner.close();
    }
}

import java.util.Scanner;

public class Nminsizesubarraysum {
    public static int minSubArrayLen(int target, int[] arr) {
        int start = 0;
        int end = 0;
        int minLength = arr.length + 1;
        int sum = 0;
        while (end < arr.length) {
            sum += arr[end];
            while (sum >= target && start < arr.length) {
                minLength = Math.min(minLength, end - start + 1);
                sum -= arr[start];
                start++;
            }

            end++;
        }
        if (minLength == arr.length + 1) {
            return 0;
        }
        return minLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minSubArrayLen(target, arr));
    }
}

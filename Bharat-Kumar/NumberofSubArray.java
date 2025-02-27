import java.util.*;

public class NumberofSubArray {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length, sum = 0, count = 0;
        
        for (int i = 0; i < k; i++)
            sum += arr[i];

        if (sum / k >= threshold)
            count++;

        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            if (sum / k >= threshold)
                count++;
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), threshold = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        NumberofSubArray sol = new NumberofSubArray();
        System.out.println(sol.numOfSubarrays(arr, k, threshold));
        sc.close();
    }
}

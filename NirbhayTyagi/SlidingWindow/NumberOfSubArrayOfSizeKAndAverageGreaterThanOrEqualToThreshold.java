
import java.util.Scanner;

class NumberOfSubArrayOfSizeKAndAverageGreaterThanOrEqualToThreshold{
    public  static int  numOfSubarrays(int[] arr, int k, int threshold) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int cnt = 0;
        while(end < arr.length){
            sum += arr[end];
            if(end - start + 1 == k){
                int average = sum / k;
                if(average >= threshold){
                    cnt++;
                }
                sum -= arr[start];
                start++;
            }
            end++;
            }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number Of Elements In an Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of Array:");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter The Value of k:");
        int k = sc.nextInt();
        System.out.println("Enter The Value of threshold:");
        int threshold = sc.nextInt();
        System.out.println("The Number of Subarray:" + numOfSubarrays(arr, k, threshold));
    }
}

//time complexity of the function: O(n)
//space complexity of the function : O(1)

//time complexity of whole program: O(n)+O(n)
//space complexity of the whole program: O(n)
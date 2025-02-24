// 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

import java.util.Scanner;

class numberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {

        int answer = 0;
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (i >= k) {
                sum -= arr[i - k];
            }
            if (i >= k - 1 && sum >= threshold * k) {
                ++answer;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Enter element " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the number of sub-arrays: ");
        int k = sc.nextInt();
        System.out.println("Enter threshold value: ");
        int threshold = sc.nextInt();
        int result = numOfSubarrays(arr, k, threshold);
        System.out.println("Number of subarrays with size " + k + " and average greater than or equal to " + threshold + " is: " + result);
        sc.close();
    }
}


//Time Complexity: O(n)
//Space Complexity: O(1)
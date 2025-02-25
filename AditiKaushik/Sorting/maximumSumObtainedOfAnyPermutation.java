// 1589. Maximum Sum Obtained of Any Permutation

import java.util.Arrays;
import java.util.Scanner;

class maximumSumObtainedOfAnyPermutation{
    public static int maxSumRangeQuery(int[] nums, int[][] requests) {
        int[] arr = new int[nums.length];
        long sum = 0;
        for (int[] request : requests) {
            arr[request[0]] += 1;
            if (request[1] + 1 < arr.length) {
                arr[request[1] + 1] += -1;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        Arrays.sort(arr);
        Arrays.sort(nums);
    
        for (int i = 0; i < arr.length; i++) {
            sum += (long) arr[i] * nums[i];
        }
        return (int) (sum % 1000_000_007);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i =0; i< size; i++){
            System.out.println("Enter element " + (i+1) + " : ");
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the size of an request array: ");
        int requestSize = sc.nextInt();
        int[][] requests = new int[requestSize][2];
        for (int i = 0; i < requestSize; i++){
            System.out.println("Enter start of request: ");
            requests[i][0] = sc.nextInt();
            System.out.println("Enter end of request: ");
            requests[i][1] = sc.nextInt();
        }
        System.out.println(maxSumRangeQuery(nums, requests));
        sc.close();
    }
}

//Time Complexity: O(n log n + m)
//Space Complexity: O(n)
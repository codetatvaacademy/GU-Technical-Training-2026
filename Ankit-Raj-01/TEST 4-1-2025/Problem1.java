import java.util.Scanner;

class Problem1 {
    // funtion to find the index
    private static int findBalanceIndex(int[] arr) {
        int[] postSum = new int[arr.length];
        postSum[arr.length-1] = arr[arr.length-1];

        for(int i = arr.length-2; i >= 0; i--) {
            postSum[i] = postSum[i+1] + arr[i];
        }
        int leftSum = 0;

        for(int i = 0; i < arr.length - 1; i++) {
            // whenever the left-side sum is equal to the right-side sum return the index
            if(leftSum == postSum[i+1]) {
                return i;
            }
            leftSum += arr[i];
        }
        
        //Handling base case when reaching at the last element, the sum is 0
        if(leftSum == 0) {
            return arr.length-1;
        }
        // if after traversing all we didn't get the expected index, return -1
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i <length; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = findBalanceIndex(arr);
        System.out.println("The balanced index is: " + ans);

        // Time complexity O(n + n) = O(n) without considering the input loop 
        // With considering the loop O(3n) = O(n) 
        // Final T(O(n)) 
        // space is O(n);
        sc.close();
    }
}
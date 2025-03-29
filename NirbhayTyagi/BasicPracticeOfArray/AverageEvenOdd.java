package BasicPracticeOfArray;

import java.util.Scanner;

class AverageEvenOdd {
    public static void averageEvenOdd(int[] nums) {
        int evenSum = 0, oddSum = 0, evenCount = 0, oddCount = 0;       
        for (int num : nums) {  
            if (num % 2 == 0) {
                evenSum += num;
                evenCount++;
            } else {
                oddSum += num;
                oddCount++;
            }
        }
        double evenAvg = (evenCount > 0) ? (double) evenSum / evenCount : 0; 
        double oddAvg = (oddCount > 0) ? (double) oddSum / oddCount : 0;           
        System.out.println("Average of even numbers: " + evenAvg);
        System.out.println("Average of odd numbers: " + oddAvg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();       
        int[] nums = new int[n];  
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {  
            nums[i] = sc.nextInt();
        }
        averageEvenOdd(nums);  
    }
}

//time complexity of the function is : O(n)
//space complexity of the function is : O(1)

//time complexity of the whole program is : O(n) 
//space complexity of the whole program is : O(n)


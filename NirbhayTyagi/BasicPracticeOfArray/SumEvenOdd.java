package BasicPracticeOfArray;

import java.util.Scanner;

class SumEvenOdd {
    public static void sumEvenOdd(int[] nums) {
        int evenSum = 0, oddSum = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
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
        sumEvenOdd(nums);  
    }
}

//time complexity of the function is : O(n)
//space complexity of the function is : O(1)

//time complexity of the whole program is : O(n) 
//space complexity of the whole program is : O(n)

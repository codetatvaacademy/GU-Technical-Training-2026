// 167. Two Sum II - Input Array Is Sorted

import java.util.Arrays;
import java.util.Scanner;

class twoSumII_InputArrayIsSorted{
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;        
        while (left < right) {
            int sum = numbers[left] + numbers[right];            
            if (sum == target) {
                return new int[] {left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }        
        return new int[] {};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for(int i =0; i< size; i++){
            System.out.println("Enter element " + (i+1) + " : ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(twoSum(numbers, target)));
        sc.close();
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
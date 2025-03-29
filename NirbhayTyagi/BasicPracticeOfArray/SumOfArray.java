package BasicPracticeOfArray;

import java.util.Scanner;

class SumOfArray{
    public static int sum(int[] nums){
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i = 0; i< n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("The sum of the array is:" + sum(nums));
    }
}
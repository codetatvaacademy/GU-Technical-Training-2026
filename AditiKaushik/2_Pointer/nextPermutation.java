// 31. Next Permutation

import java.util.Scanner;

class nextPermutation{
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void next_Permutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            reverse(nums, 0, n - 1);
        } else {
            
            int idx = -1;
            for (int i = n - 1; i > pivot; i--) {
                if (nums[i] > nums[pivot]) {
                    idx = i;
                    break;
                }
            }

            swap(nums, pivot, idx);

            reverse(nums, pivot + 1, n - 1);
        }
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Enter element " + (i+1) + " : ");
            nums[i] = sc.nextInt();
        }
        next_Permutation(nums);

        System.out.println("Next permutation: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
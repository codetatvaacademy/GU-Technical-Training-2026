// 80. Remove Duplicates from Sorted Array II

import java.util.Scanner;

class removeDuplicatesFromSortedArrayII{
    public static int removeDuplicates(int[] nums) {
        int k = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Enter element " + (i+1) + " : ");
            nums[i] = sc.nextInt();
        }
        System.out.println(removeDuplicates(nums));
        sc.close();
    }
}

//Time Complexity: O(n)
//Spce Complexity: O(1)
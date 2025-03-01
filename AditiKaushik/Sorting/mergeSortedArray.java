// 88. Merge Sorted Array

import java.util.Arrays;
import java.util.Scanner;

class mergeSortedArray{
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array 1: ");
        int m = sc.nextInt();
        System.out.println("Enter the size of an array 2: ");
        int n = sc.nextInt();
        int[] nums1 = new int[m + n];
        System.out.println("For array 1: ");
        for(int i =0; i< m; i++){
            System.out.println("Enter element " + (i+1) + " : ");
            nums1[i] = sc.nextInt();
        }
        int[] nums2 = new int[n];
        System.out.println("For array 2: ");
        for(int i =0; i< n; i++){
            System.out.println("Enter element " + (i+1) + " : ");
            nums2[i] = sc.nextInt();
        }
        merge(nums1, m, nums2, n);
        sc.close();
    }
}

//Time Complexity: O(m + n)
//Space Complexity: O(1)
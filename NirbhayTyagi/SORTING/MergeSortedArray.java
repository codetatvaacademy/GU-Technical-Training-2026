import java.util.Arrays;
import java.util.Scanner;

class MergeSortedArray{
     public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m");
        int m = sc.nextInt();
        int[] nums1 = new int[m + 3];
        System.out.println("enter the nums1 array");
        for(int i =0; i < m; i++){
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int[] nums2 = new int[n];
        System.out.println("Enter the nums2 array");
        for(int i = 0; i < n; i++){
            nums2[i] = sc.nextInt();
        }
        merge(nums1, m, nums2, n);
        System.out.println("The resultant sorted array is: ");
        for(int i = 0; i < m + n; i++){
            System.out.print(nums1[i] + " ");
        }
    }
}

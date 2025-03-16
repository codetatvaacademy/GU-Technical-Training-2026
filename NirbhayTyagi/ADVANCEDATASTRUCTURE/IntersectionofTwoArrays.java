import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class IntersectionofTwoArrays{
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
           if(set1.contains(num)){
            set2.add(num);
           }
        }
        int[] result = new int[set2.size()];
        int i = 0;
        for(int num : set2){
            result[i++] = num;
        }

        return result; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the nums1");
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        System.out.println("Enter the elements of the nums1 array:");
        for(int i = 0; i < n; i++){
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter the number of elements in the nums2");
        int m = sc.nextInt();
        int[] nums2 = new int[m];
        System.out.println("Enter the elements of the nums2 array:");
        for(int i = 0; i < m; i++){
            nums2[i] = sc.nextInt();
        }
        System.out.println("The resultant array is: " + Arrays.toString(intersection(nums1, nums2)));
    }
}
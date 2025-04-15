import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class IntersectionofTwoArraysII{
    public static int[] intersect(int[] nums1, int[] nums2) {
      HashMap<Integer,Integer> map = new HashMap<>();
      List<Integer> resultList = new ArrayList<>();
      for( int num :nums1){
        map.put(num, map.getOrDefault(num, 0) +1);
      }
      for(int num : nums2){
        if(map.containsKey(num) && map.get(num) > 0){
            resultList.add(num);
            map.put(num, map.get(num) -1);
        }
      }
      int[] result = new int[resultList.size()];
      for(int i = 0; i < resultList.size(); i++){
        result[i] = resultList.get(i);
      }
    return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in nums1");
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        System.out.println("Enter the elements of nums1");
        for(int i = 0; i < n; i++){
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter the number of elements in nums2");
        int m = sc.nextInt();
        int[] nums2 = new int[m];
        System.out.println("Enter the elements of nums1");
        for(int i = 0; i < m; i++){
            nums2[i] = sc.nextInt();
        }
        System.out.println("The intersect array is " + Arrays.toString(intersect(nums1, nums2)));
    }
}
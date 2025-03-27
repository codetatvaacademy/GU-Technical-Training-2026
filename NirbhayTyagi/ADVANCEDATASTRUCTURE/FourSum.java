import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class FourSum{
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for(int n : nums1){
            for(int m : nums2){
                int sum = n + m;
                map.put(sum,map.getOrDefault(sum,0) + 1);
            }
        }
        for(int o : nums3){
            for(int p : nums4){
                int sum = o + p;
                answer += map.getOrDefault(-sum,0);
            }
        }
    return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of nums array");
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        System.out.println("Enter the elements of the nums1");
        for(int i = 0; i < n; i++){
            nums1[i] = sc.nextInt();
        }
        int[] nums2 = new int[n];
        System.out.println("Enter the elements of the nums2");
        for(int i = 0; i < n; i++){
            nums2[i] = sc.nextInt();
        }
        int[] nums3 = new int[n];
        System.out.println("Enter the elements of the nums3");
        for(int i = 0; i < n; i++){
            nums3[i] = sc.nextInt();
        }
        int[] nums4 = new int[n];
        System.out.println("Enter the elements of the nums4");
        for(int i = 0; i < n; i++){
            nums4[i] = sc.nextInt();
        }
        System.out.println("The number of tuples: " + fourSumCount(nums1, nums2, nums3, nums4));
    }
}